package fr.ubo.fast.client.app;

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

import fr.ubo.fast.common.constant.DeploymentProperties;
import fr.ubo.fast.common.constant.PerformanceProfileProperties;
import fr.ubo.fast.common.model.Computer;
import fr.ubo.fast.common.model.ComputerType;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.PerformanceProfile;
import fr.ubo.fast.common.model.WebServer;
import fr.ubo.fast.performance.intervals.IntervalSelectionNative;
import fr.ubo.fast.performance.intervals.PerformanceTest;
import fr.ubo.fast.common.utility.DataStructureHelper;

/**
 * Class that is responsible for configuring the FaST framework on the client-side.
 */
public class Application
{	
	/** Performance profile of the model. */
	private PerformanceProfile performance_profile;
	/** Web server properties. */
	private WebServer web_server;
	/** Server properties. */
	private Computer server;
	/** Time series meta-data. */
	private TimeSeries time_series_data;
	/** Performance test runner. */
	private PerformanceTest performance_test;
	/** Intervals configuration object. */
	private IntervalSelectionNative intervals_selection;
	/** File descriptor of the currently executed JAR. */
	private File current_jar_file;
	/** File descriptor of the current folder. */
	private File current_folder;
	/** File descriptor of the configuration files folder. */
	private File configuration_files_folder;
	/** File descriptor of the web server folder. */
	private File web_server_folder;
	/** File descriptor of the Docker folder. */
	private File docker_folder;
	/** File descriptor of the client folder. */
	private File client_folder;
	/** Web server folder file list. */
	private ArrayList<String> web_server_file_names = new ArrayList<String>();
	/** Docker folder file list. */
	private ArrayList<String> docker_file_names = new ArrayList<String>();
	/** Performance profile file list. */
	private ArrayList<String> performance_profile_file_names = new ArrayList<String>();
	/** Logger object. */
	private Logger logger;
	
	public Application()
	{
		logger = Logger.getLogger(this.getClass().getCanonicalName());
		
		try
		{
			current_jar_file = new File(Application.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			current_folder = current_jar_file.getParentFile();
			configuration_files_folder = new File(current_folder, DeploymentProperties.CONF_FOLDER.toString());
			web_server_folder = new File(configuration_files_folder, DeploymentProperties.WEB_SERVER_FOLDER.toString());
			client_folder = new File(configuration_files_folder, DeploymentProperties.CLIENT_FOLDER.toString());
			docker_folder = new File(configuration_files_folder, DeploymentProperties.DOCKER_FOLDER.toString());
			web_server_file_names = DataStructureHelper.findFiles(web_server_folder.toPath(), DeploymentProperties.WEB_SERVER_FILE_PATTERN.toString());
			performance_profile_file_names = DataStructureHelper.findFiles(client_folder.toPath(), DeploymentProperties.PERFORMANCE_PROFILE_FILE_PATTERN.toString());
			docker_file_names = DataStructureHelper.findFiles(docker_folder.toPath(), DeploymentProperties.SERVER_FILE_PATTERN.toString());
		}
		catch (URISyntaxException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (Exception exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		
		File web_server_file = new File(web_server_file_names.get(0));
		File visualization_tool_file = new File(performance_profile_file_names.get(0));
		File server_file = new File(docker_file_names.get(0));
		
		performance_profile = new PerformanceProfile(visualization_tool_file);
		web_server = new WebServer(web_server_file);
		server = new Computer(ComputerType.SERVER, server_file);
	}
	
	/**
	 * Run performance tests and save the results.
	 */
	public void runTests()
	{
		logger.info("Running tests.");
		
		performance_test = new PerformanceTest(web_server, performance_profile);
		
		performance_test.initialize();
		logger.info("Computing ping time.");
		performance_test.computePingTime();
		logger.info("Computing raw data threshold.");
		performance_test.computeRawDataThreshold();
		logger.info("Computing pre-computed data threshold.");
		performance_test.computePreComputedDataThreshold();

		time_series_data = performance_test.getTimeSeriesData();
		
		intervals_selection = new IntervalSelectionNative(performance_profile, time_series_data);
		intervals_selection.computeIntervals();
		
		logger.info("Saving test results.");
		
		Map<String, String> properties_map = new HashMap<String, String>();
		properties_map.put(PerformanceProfileProperties.PING_TIME.toString(), String.valueOf(performance_profile.getPingTime()));
		properties_map.put(PerformanceProfileProperties.RAW_DATA_THRESHOLD.toString(), String.valueOf(performance_profile.getRawDataThreshold()));
		properties_map.put(PerformanceProfileProperties.PRE_COMPUTED_DATA_THRESHOLD.toString(), String.valueOf(performance_profile.getPreComputedDataThreshold()));
		
		DataStructureHelper.setProperties(new File(client_folder, DeploymentProperties.TEST_RESULTS_FILE.toString()), properties_map);
		DataStructureHelper.serializeTimeSeries(new File(client_folder, DeploymentProperties.TIME_SERIES_DATA_FILE.toString()), time_series_data);
		
		File generated_intervals_file = new File(client_folder, DeploymentProperties.GENERATED_INTERVALS_FILE.toString());
		TreeMap<Long, Long> generated_intervals = performance_profile.getIntervals();
		TreeMap<String, String> string_intervals = new TreeMap<String, String>();
		generated_intervals.forEach((key, value) -> string_intervals.put(String.valueOf(key), String.valueOf(value)));
		DataStructureHelper.setProperties(generated_intervals_file, string_intervals);
	}
	
	/**
	 * Send test results to the server.
	 */
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