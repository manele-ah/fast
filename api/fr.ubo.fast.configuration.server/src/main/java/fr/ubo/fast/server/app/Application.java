package fr.ubo.fast.server.app;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Logger;

import fr.ubo.fast.common.constant.DeploymentProperties;
import fr.ubo.fast.common.constant.PerformanceProfileProperties;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.PerformanceProfile;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.performance.intervals.PerformanceTest;

/**
 * Class that is responsible for configuring the FaST framework on the server-side.
 */
public class Application
{
	/** Performance profile of the model. */
	private PerformanceProfile performance_profile;
	/** Time series meta-data. */
	private TimeSeries time_series_data;
	/** Performance test runner. */
	private PerformanceTest performance_test;
	/** File descriptor of the currently executed JAR. */
	private File current_jar_file;
	/** File descriptor of the current folder. */
	private File current_folder;
	/** File descriptor of the configuration files folder. */
	private File configuration_files_folder;
	/** File descriptor of the client folder. */
	private File client_folder;
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
			client_folder = new File(configuration_files_folder, DeploymentProperties.CLIENT_FOLDER.toString());
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
	}
	
	/**
	 * Initialize model objects using the configuration files provided.
	 */
	public void initializeModel()
	{
		performance_profile_file_names = DataStructureHelper.findFiles(client_folder.toPath(), DeploymentProperties.PERFORMANCE_PROFILE_FILE_PATTERN.toString());
		File performance_file = new File(performance_profile_file_names.get(0));
		
		performance_profile = new PerformanceProfile(performance_file);
	}
	
	/**
	 * Read the results of the performance tests performed on the client.
	 */
	public void readPerformanceTestResults()
	{	
		logger.info("Reading results.");
		File test_results = new File(client_folder, DeploymentProperties.TEST_RESULTS_FILE.toString());
		Properties properties = DataStructureHelper.getProperties(test_results);
		
		double ping_time = 0.0;
		double raw_data_threshold = 0.0;
		double pre_computed_data_threshold = 0.0;
		
		try
		{
			ping_time = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.PING_TIME.toString()));
			raw_data_threshold = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.RAW_DATA_THRESHOLD.toString()));
			pre_computed_data_threshold = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.PRE_COMPUTED_DATA_THRESHOLD.toString()));
		}
		catch (NumberFormatException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (NullPointerException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		
		time_series_data = DataStructureHelper.deserializeTimeSeries(new File(client_folder, DeploymentProperties.TIME_SERIES_DATA_FILE.toString()));
		performance_test.setTimeSeriesData(time_series_data);
		
		File generated_intervals = new File(client_folder, DeploymentProperties.GENERATED_INTERVALS_FILE.toString());
		performance_profile.setIntervalsFromFile(generated_intervals);
		
		performance_profile.setPingTime(ping_time);
		performance_profile.setRawDataThreshold(raw_data_threshold);
		performance_profile.setPreComputedDataThreshold(pre_computed_data_threshold);
	}
	
	/**
	 * Update the performance profile file with the received performance parameters.
	 */
	public void updatePerformanceProfile()
	{
		File performance_profile_file = new File(performance_profile_file_names.get(0));
		File updated_visualization_tool_file = new File(client_folder, "updated_" + performance_profile_file.getName());
		
		Properties properties = DataStructureHelper.getProperties(performance_profile_file);
		HashMap<String, String> properties_map = DataStructureHelper.convertPropertiesToMap(properties);
					
		properties_map.put(PerformanceProfileProperties.PING_TIME.toString(), String.valueOf(performance_profile.getPingTime()));
		properties_map.put(PerformanceProfileProperties.RAW_DATA_THRESHOLD.toString(), String.valueOf(performance_profile.getRawDataThreshold()));
		properties_map.put(PerformanceProfileProperties.PRE_COMPUTED_DATA_THRESHOLD.toString(), String.valueOf(performance_profile.getPreComputedDataThreshold()));
		
		DataStructureHelper.setProperties(updated_visualization_tool_file, properties_map);
		updated_visualization_tool_file.renameTo(performance_profile_file);
	}
	
	public static void main(String[] args)
	{
		Application app = new Application();
		app.readPerformanceTestResults();
		app.updatePerformanceProfile();
	}
}