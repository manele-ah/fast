package fr.ubo.fast.configuration.server.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MinMaxVisualizationClient;
import fr.ubo.fast.TimeSeriesFramework;
import fr.ubo.fast.acceleo.main.GenerateConfigurationFiles;
import fr.ubo.fast.common.constants.ComputerType;
import fr.ubo.fast.common.constants.DeploymentProperties;
import fr.ubo.fast.common.constants.VisualizationClientProperties;
import fr.ubo.fast.common.model.Computer;
import fr.ubo.fast.common.model.Database;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.VisualizationClient;
import fr.ubo.fast.common.model.WebServer;
import fr.ubo.fast.common.performance.PerformanceTest;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.dsl.DslStandaloneSetup;

public class Application
{
	private VisualizationClient visualization_client;
	private WebServer web_server;
	private Computer server;
	private Computer client;
	private Database database;
	private TimeSeries time_series_data;
	
	private TimeSeriesFramework framework_root;
	private MinMaxVisualizationClient min_max_visualization_client;
	
	private PerformanceTest performance_test;
	
	private File current_jar_file;
	private File current_folder;
	private File configuration_files_folder;
	private File web_server_folder;
	private File docker_folder;
	private File visualization_tool_folder;
	private File model_instance_file;
	private File updated_model_instance_file;
	private URI model_instance_uri;
	
	private ArrayList<String> web_server_file_names = new ArrayList<String>();
	private ArrayList<String> visualization_tool_file_names = new ArrayList<String>();
	private ArrayList<String> time_scale_db_file_names = new ArrayList<String>();
	private ArrayList<String> docker_file_names = new ArrayList<String>();
	private ArrayList<String> client_file_names = new ArrayList<String>();
	
	private Resource resource;
	private ResourceSet resource_set;
	
	private Display display;
	private Shell shell;
	private Button install_deploy_button;
	private Button optimize_tables_button;
	private Button reconfigure_viewer_button;
	private Label label;
	
	private Logger logger;
	
	private static final String SERVER_EMPTY_PASSWORD_MESSAGE = "This installation requires root privileges. Please enter your password :";
	private static final String CLIENT_EMPTY_PASSWORD_MESSAGE = "Remote access requires authentication. Please enter the password of the remote client :";
	private static final String MODEL_INSTANCE_RELATIVE_PATH = "obeo/11.1/workspace/fr.ubo.fast.instances/framework.fast";
	private static final String UPDATED_MODEL_INSTANCE_RELATIVE_PATH = "obeo/11.1/workspace/fr.ubo.fast.instances/framework.fast";
	private static final int AREA_WIDTH = 600;
	private static final int AREA_HEIGHT = 200;

	public Application()
	{
		logger = Logger.getLogger(this.getClass().getCanonicalName());
		
		try
		{
			current_jar_file = new File(Application.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			current_folder = current_jar_file.getParentFile();
			// current_folder = new File("/usr/share/fast");
			configuration_files_folder = new File(current_folder, DeploymentProperties.CONF_FOLDER.toString());
			web_server_folder = new File(configuration_files_folder, DeploymentProperties.WEB_SERVER_FOLDER.toString());
			visualization_tool_folder = new File(configuration_files_folder, DeploymentProperties.VISUALIZATION_TOOL_FOLDER.toString());
			docker_folder = new File(configuration_files_folder, DeploymentProperties.DOCKER_FOLDER.toString());
			
			model_instance_file = new File(current_folder, MODEL_INSTANCE_RELATIVE_PATH);
			updated_model_instance_file = new File(current_folder, UPDATED_MODEL_INSTANCE_RELATIVE_PATH);
			model_instance_uri = URI.createFileURI(URI.decode(model_instance_file.getAbsolutePath()));
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
		
		resource_set = new ResourceSetImpl();
		resource_set.getPackageRegistry().put(FastPackage.eNS_URI, FastPackage.eINSTANCE);
		DslStandaloneSetup.doSetup();
		resource = resource_set.getResource(model_instance_uri, true);
		framework_root = (TimeSeriesFramework) resource.getContents().get(0);
	}
	
	@SuppressWarnings("unused")
	public void generateConfigurationFiles()
	{
		try
		{
			if (!configuration_files_folder.exists())
			{
				Path path = Files.createDirectory(configuration_files_folder.toPath());
			}
			GenerateConfigurationFiles generator = new GenerateConfigurationFiles(model_instance_uri, configuration_files_folder, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		
		web_server_file_names = DataStructureHelper.findFiles(web_server_folder.toPath(), DeploymentProperties.WEB_SERVER_FILE_PATTERN.toString());
		visualization_tool_file_names = DataStructureHelper.findFiles(visualization_tool_folder.toPath(), DeploymentProperties.VISUALIZATION_TOOL_FILE_PATTERN.toString());
		time_scale_db_file_names = DataStructureHelper.findFiles(web_server_folder.toPath(), "_data_provider_database.properties");
		docker_file_names = DataStructureHelper.findFiles(docker_folder.toPath(), DeploymentProperties.SERVER_FILE_PATTERN.toString());
		client_file_names = DataStructureHelper.findFiles(visualization_tool_folder.toPath(), DeploymentProperties.CLIENT_FILE_PATTERN.toString());
		
		// For now, the implementation supports only one server and one visualization tool
		File web_server_file = new File(web_server_file_names.get(0));
		File visualization_tool_file = new File(visualization_tool_file_names.get(0));
		File database_file = new File(time_scale_db_file_names.get(0));
		File server_file = new File(docker_file_names.get(0));
		File client_file = new File(client_file_names.get(0));
		
		visualization_client = new VisualizationClient(visualization_tool_file);
		database = new Database(database_file);
		web_server = new WebServer(web_server_file);
		server = new Computer(ComputerType.SERVER, server_file);
		client = new Computer(ComputerType.CLIENT, client_file);
	}
	
	public void runInstallScript()
	{

		try
		{
			if (server.getPassword().isEmpty())
			{
				PasswordDialog dialog = new PasswordDialog(shell, SERVER_EMPTY_PASSWORD_MESSAGE);
				if (dialog.open() == Window.OK)
				{
					server.setPassword(dialog.getPassword());
				}
			}
			
			String[] command = {"/bin/bash", "-c", String.format(" echo %s| sudo -S ./install.sh", server.getPassword())};
			Process process = Runtime.getRuntime().exec(command);
			
			String line = "";
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((line = input.readLine()) != null)
			{
				logger.info(line);
			}
			input.close();
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public void runTestsRemotely()
	{	
		logger.info("Executing tests remotely.");
		performance_test = new PerformanceTest(web_server, visualization_client);	

		try
		{
			if (client.getPassword().isEmpty())
			{
				PasswordDialog dialog = new PasswordDialog(shell, CLIENT_EMPTY_PASSWORD_MESSAGE);
				if (dialog.open() == Window.OK)
				{
					client.setPassword(dialog.getPassword());
				}
			}			
			
			String[] command = {"/bin/bash", "./run_tests.sh", client.getUsername(), client.getPassword(), client.getHostname()};
			Process process = Runtime.getRuntime().exec(command);
			
			process.waitFor();
			
			String line = "";
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((line = input.readLine()) != null)
			{
				logger.info(line);
			}
			input.close();
		}
		catch (InterruptedException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		
		// Read results
		/* System.out.println("Waiting for results");
		Path client_path = client_folder.toPath();
		try
		{
			WatchService watch_service = FileSystems.getDefault().newWatchService();
			WatchKey watch_key = client_path.register(watch_service, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE);
			boolean poll = true;
			while (poll)
			{
				WatchKey key = watch_service.take();
				for (WatchEvent<?> event : key.pollEvents())
				{
					final Path file_changed = (Path) event.context();
					if (file_changed.endsWith(".properties"))
					{
						System.out.println("File .properties has changed");
					}
					if (file_changed.endsWith(".data"))
					{
						System.out.println("File .data has changed");
					}
				}
				poll = key.reset();
			}
		}
		catch (InterruptedException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		} */
		
		logger.info("Reading results.");
		File test_results = new File(visualization_tool_folder, DeploymentProperties.TEST_RESULTS_FILE.toString());
		Properties properties = DataStructureHelper.getProperties(test_results);
		
		double ping_time = 0.0;
		double raw_data_threshold = 0.0;
		double pre_computed_data_threshold = 0.0;
		
		try
		{
			ping_time = Double.parseDouble(properties.getProperty(VisualizationClientProperties.PING_TIME.toString()));
			raw_data_threshold = Double.parseDouble(properties.getProperty(VisualizationClientProperties.RAW_DATA_THRESHOLD.toString()));
			pre_computed_data_threshold = Double.parseDouble(properties.getProperty(VisualizationClientProperties.PRE_COMPUTED_DATA_THRESHOLD.toString()));
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
		
		time_series_data = DataStructureHelper.deserializeTimeSeries(new File(visualization_tool_folder, DeploymentProperties.TIME_SERIES_DATA_FILE.toString()));
		performance_test.setTimeSeriesData(time_series_data);
		
		File generated_intervals = new File(visualization_tool_folder, DeploymentProperties.GENERATED_INTERVALS_FILE.toString());
		visualization_client.setIntervalsFromFile(generated_intervals);
		
		visualization_client.setPingTime(ping_time);
		visualization_client.setRawDataThreshold(raw_data_threshold);
		visualization_client.setPreComputedDataThreshold(pre_computed_data_threshold);
	}
	
	public void updateModelInstance()
	{
		min_max_visualization_client = (MinMaxVisualizationClient) framework_root.getClients().get(0);
		min_max_visualization_client.setPingTime(visualization_client.getPingTime());
		min_max_visualization_client.setRawDataThreshold(visualization_client.getRawDataThreshold());
		min_max_visualization_client.setPreComputedDataThreshold(visualization_client.getPreComputedDataThreshold());
		
		FileOutputStream output = null;
		HashMap<Object, Object> save_options = new HashMap<Object, Object>();
		save_options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, false);
		try
		{
			output = new FileOutputStream(updated_model_instance_file);
			resource.save(output, save_options);
			output.close();
		}
		catch (FileNotFoundException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public void updateVisualizationToolFile()
	{
		File visualization_tool_file = new File(visualization_tool_file_names.get(0));
		File updated_visualization_tool_file = new File(visualization_tool_folder, "updated_" + visualization_tool_file.getName());
		
		Properties properties = DataStructureHelper.getProperties(visualization_tool_file);
		HashMap<String, String> properties_map = DataStructureHelper.convertPropertiesToMap(properties);
					
		properties_map.put(VisualizationClientProperties.PING_TIME.toString(), String.valueOf(visualization_client.getPingTime()));
		properties_map.put(VisualizationClientProperties.RAW_DATA_THRESHOLD.toString(), String.valueOf(visualization_client.getRawDataThreshold()));
		properties_map.put(VisualizationClientProperties.PRE_COMPUTED_DATA_THRESHOLD.toString(), String.valueOf(visualization_client.getPreComputedDataThreshold()));
		
		DataStructureHelper.setProperties(updated_visualization_tool_file, properties_map);
		updated_visualization_tool_file.renameTo(visualization_tool_file);
	}
	
	public void createMinMaxTables()
	{		
		HashSet<Long> values = new HashSet<>(visualization_client.getIntervals().values());
		values.removeIf(element -> element == -1);
		String intervals = "";
		if (values.size() > 0)
		{
			try
			{
				if (values.size() == 0)
				{
					intervals = "[" + String.valueOf(values.iterator().next()) + "]";
				}
				else
				{
					intervals = "[" + values.stream().map(Object::toString).collect(Collectors.joining(",")) + "]";
				}
				
				System.out.println(intervals);
				
				String[] command = {"/bin/bash", "-c", String.format(" echo %s| sudo -S ./create_min_max_tables.sh %s %s %s %s %s %s %s %s", server.getPassword(), String.valueOf(visualization_client.getTimeSeriesId()), time_series_data.getStartDate().toString(), time_series_data.getEndDate().toString(), intervals, "timescaledb", database.getUsername(), database.getPassword(), database.getName())};
				System.out.println(Arrays.toString(command));
				Process process = Runtime.getRuntime().exec(command);
				
				String line = "";
				BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
				while ((line = input.readLine()) != null)
				{
					logger.info(line);
				}
				input.close();
			}
			catch (IOException exception)
			{
				logger.info(exception.getMessage());
				exception.printStackTrace();
			}
		}
		else
		{
			logger.info("Pre-computed tables are not needed.");
		}
		
	}
	
	public void reconfigureViewer()
	{
		logger.info("Sending reconfiguration files.");

		try
		{
			// If password empty
			
			String[] command = {"/bin/bash", "./reconfigure_viewer.sh", client.getUsername(), client.getPassword(), client.getHostname()};
			Process process = Runtime.getRuntime().exec(command);
			
			process.waitFor();
			
			String line = "";
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((line = input.readLine()) != null)
			{
				logger.info(line);
			}
			input.close();
		}
		catch (InterruptedException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			logger.info(exception.getMessage());
			exception.printStackTrace();
		}
		
	}

	public void show()
	{
		display = new Display();
		shell = new Shell(display);
		
		GridLayout layout = new GridLayout();
		shell.setLayout(layout);
		
		install_deploy_button = new Button(shell, SWT.PUSH);
		install_deploy_button.setText("Install and deploy Docker services (TimeScaleDB and Apache)");
		install_deploy_button.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent event)
			{
				logger.info("Starting configuration files generation.");
				generateConfigurationFiles();
				logger.info("Installing Docker services.");
				runInstallScript();
			}
		});
		
		optimize_tables_button = new Button(shell, SWT.PUSH);
		optimize_tables_button.setText("Optimize tables");
		optimize_tables_button.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent event)
			{
				logger.info("Regenerating configuration files.");
				generateConfigurationFiles();
				logger.info("Running performance tests.");
				runTestsRemotely();
				logger.info("Updating model instance.");
				updateModelInstance();
				logger.info("Updating the viewer configuration file.");
				updateVisualizationToolFile();
				logger.info("Creating pre-computed tables.");
				createMinMaxTables();
			}
		});
		
		reconfigure_viewer_button = new Button(shell, SWT.PUSH);
		reconfigure_viewer_button.setText("Reconfigure viewer");
		reconfigure_viewer_button.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent event)
			{
				logger.info("Regenerating configuration files");
				generateConfigurationFiles();
				logger.info("Reconfiguring viewer");
				reconfigureViewer();
			}
		});
		
		GridData grid_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		grid_data.verticalSpan = 1;
		install_deploy_button.setLayoutData(grid_data);
		grid_data.verticalSpan = 2;
		optimize_tables_button.setLayoutData(grid_data);
		grid_data.verticalSpan = 3;
		reconfigure_viewer_button.setLayoutData(grid_data);
		
		label = new Label(shell, SWT.FILL);
		grid_data.verticalSpan = 4;
		grid_data.horizontalSpan = 3;
		label.setLayoutData(grid_data);
		
		Point shell_size = shell.getSize();
        Rectangle client_area = shell.getClientArea();

		shell.setSize
        (
            AREA_WIDTH + shell_size.x - client_area.width,
            AREA_HEIGHT + shell_size.y - client_area.height
        );
		shell.open();
		while (!shell.isDisposed())
		{
			if (!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		display.dispose();
	}
	
	public static void main(String[] args)
	{
		new Application().show();
	}
}