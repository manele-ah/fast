package fr.ubo.fast.configuration.client.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

import fr.ubo.fast.common.model.Computer;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.VisualizationClient;
import fr.ubo.fast.common.model.WebServer;
import fr.ubo.fast.common.performance.IntervalSelectionNative;
import fr.ubo.fast.common.performance.PerformanceTest;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.common.constants.ComputerType;
import fr.ubo.fast.common.constants.DeploymentProperties;
import fr.ubo.fast.common.constants.VisualizationClientProperties;

public class Application
{	
	private VisualizationClient visualization_client;
	private WebServer web_server;
	private Computer server;
	private TimeSeries time_series_data;
		
	private PerformanceTest performance_test;
	private IntervalSelectionNative intervals_selection;
	
	private File current_jar_file;
	private File current_folder;
	private File configuration_files_folder;
	private File web_server_folder;
	private File visualization_tool_folder;
	private File docker_folder;
	
	private ArrayList<String> web_server_file_names = new ArrayList<String>();
	private ArrayList<String> visualization_tool_file_names = new ArrayList<String>();
	private ArrayList<String> docker_file_names = new ArrayList<String>();
	
	private Logger logger;
	
	public Application()
	{
		logger = Logger.getLogger(this.getClass().getCanonicalName());
		
		try
		{
			current_jar_file = new File(Application.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			current_folder = current_jar_file.getParentFile();
			current_folder = new File("C:\\Program Files\\Fast");
			configuration_files_folder = new File(current_folder, DeploymentProperties.CONF_FOLDER.toString());
			web_server_folder = new File(configuration_files_folder, DeploymentProperties.WEB_SERVER_FOLDER.toString());
			visualization_tool_folder = new File(configuration_files_folder, DeploymentProperties.VISUALIZATION_TOOL_FOLDER.toString());
			docker_folder = new File(configuration_files_folder, DeploymentProperties.DOCKER_FOLDER.toString());
			
			web_server_file_names = DataStructureHelper.findFiles(web_server_folder.toPath(), DeploymentProperties.WEB_SERVER_FILE_PATTERN.toString());
			visualization_tool_file_names = DataStructureHelper.findFiles(visualization_tool_folder.toPath(), DeploymentProperties.VISUALIZATION_TOOL_FILE_PATTERN.toString());
			docker_file_names = DataStructureHelper.findFiles(docker_folder.toPath(), DeploymentProperties.SERVER_FILE_PATTERN.toString());
		}
		catch (URISyntaxException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (NullPointerException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		
		// For now, the implementation supports only one server and one visualization tool
		File web_server_file = new File(web_server_file_names.get(0));
		File visualization_tool_file = new File(visualization_tool_file_names.get(0));
		File server_file = new File(docker_file_names.get(0));
		
		visualization_client = new VisualizationClient(visualization_tool_file);
		web_server = new WebServer(web_server_file);
		server = new Computer(ComputerType.SERVER, server_file);
	}
	
	public void runTests()
	{
		logger.info("Running tests.");
		
		performance_test = new PerformanceTest(web_server, visualization_client);
		
		performance_test.initialize();
		logger.info("Computing ping time.");
		performance_test.computePingTime();
		logger.info("Computing raw data threshold.");
		performance_test.computeRawDataThreshold();
		logger.info("Computing pre-computed data threshold.");
		performance_test.computePreComputedDataThreshold();

		time_series_data = performance_test.getTimeSeriesData();
		
		intervals_selection = new IntervalSelectionNative(visualization_client, time_series_data);
		intervals_selection.computeIntervals();
		
		logger.info("Saving test results.");
		
		Map<String, String> properties_map = new HashMap<String, String>();
		properties_map.put(VisualizationClientProperties.PING_TIME.toString(), String.valueOf(visualization_client.getPingTime()));
		properties_map.put(VisualizationClientProperties.RAW_DATA_THRESHOLD.toString(), String.valueOf(visualization_client.getRawDataThreshold()));
		properties_map.put(VisualizationClientProperties.PRE_COMPUTED_DATA_THRESHOLD.toString(), String.valueOf(visualization_client.getPreComputedDataThreshold()));
		
		DataStructureHelper.setProperties(new File(visualization_tool_folder, DeploymentProperties.TEST_RESULTS_FILE.toString()), properties_map);
		DataStructureHelper.serializeTimeSeries(new File(visualization_tool_folder, DeploymentProperties.TIME_SERIES_DATA_FILE.toString()), time_series_data);
		
		File generated_intervals_file = new File(visualization_tool_folder, DeploymentProperties.GENERATED_INTERVALS_FILE.toString());
		TreeMap<Long, Long> generated_intervals = visualization_client.getIntervals();
		TreeMap<String, String> string_intervals = new TreeMap<String, String>();
		generated_intervals.forEach((key, value) -> string_intervals.put(String.valueOf(key), String.valueOf(value)));
		DataStructureHelper.setProperties(generated_intervals_file, string_intervals);
	}
	
	public void sendData()
	{
		logger.info("Sending data.");
		
		try
		{
			String[] command = {"cmd.exe", "/c", String.format("%s\\send_results.bat", current_folder.toString()), server.getUsername(), server.getPassword(), server.getHostname()};
			Process process = Runtime.getRuntime().exec(command);
			
			String line = "";
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((line = input.readLine()) != null)
			{
				logger.info(line);
			}
			input.close();
			
			line = "";
			BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((line = error.readLine()) != null)
			{
				logger.info(line);
			}
			error.close();
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Application app = new Application();
		app.runTests();
		app.sendData();
	}
}