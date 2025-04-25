package fr.ubo.fast.gui.administration;

import java.awt.GridLayout;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import fr.ubo.fast.common.constant.DeploymentProperties;
import fr.ubo.fast.common.utility.DataStructureHelper;

public class ConfigurationPanel extends JPanel
{
	private JTextField client_username_field;
	private JPasswordField client_password_field;
	private JTextField client_host_field;

	private JTextField server_username_field;
	private JPasswordField server_password_field;
	private JTextField server_host_field;

	private JTextField docker_directory_field;
	private JTextField database_container_field;
	private JTextField web_server_container_field;

	private JComboBox<String> web_server_type_combo;
	private JTextField web_server_port_field;

	private JComboBox<String> database_type_combo;
	private JTextField database_name_field;
	private JTextField database_port_field;
	private JTextField database_data_directory_field;
	private JTextField database_username_field;
	private JPasswordField database_password_field;

	private JButton save_button;
	
	private File current_jar_file;
	private File current_folder;
	
	private static final long serialVersionUID = 455611958054510676L;

	public ConfigurationPanel()
	{
		try
		{
			current_jar_file = new File(ConfigurationPanel.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			current_folder = current_jar_file.getParentFile();
		}
		catch (URISyntaxException exception)
		{
			exception.printStackTrace();
		}
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel credentials_panel = new JPanel();
		credentials_panel.setLayout(new BoxLayout(credentials_panel, BoxLayout.X_AXIS));
		credentials_panel.setBorder(BorderFactory.createTitledBorder("Credentials"));

		JPanel client_panel = new JPanel(new GridLayout(0, 2, 5, 5));
		client_panel.setBorder(BorderFactory.createTitledBorder("Client"));
		client_panel.add(new JLabel("Username"));
		client_username_field = new JTextField();
		client_panel.add(client_username_field);
		client_panel.add(new JLabel("Password"));
		client_password_field = new JPasswordField();
		client_panel.add(client_password_field);
		client_panel.add(new JLabel("Hostname/IP address"));
		client_host_field = new JTextField();
		client_panel.add(client_host_field);

		JPanel server_panel = new JPanel(new GridLayout(0, 2, 5, 5));
		server_panel.setBorder(BorderFactory.createTitledBorder("Server"));
		server_panel.add(new JLabel("Username"));
		server_username_field = new JTextField();
		server_panel.add(server_username_field);
		server_panel.add(new JLabel("Password"));
		server_password_field = new JPasswordField();
		server_panel.add(server_password_field);
		server_panel.add(new JLabel("Hostname/IP address"));
		server_host_field = new JTextField();
		server_panel.add(server_host_field);

		credentials_panel.add(client_panel);
		credentials_panel.add(Box.createHorizontalStrut(10));
		credentials_panel.add(server_panel);

		JPanel docker_panel = new JPanel(new GridLayout(0, 2, 5, 5));
		docker_panel.setBorder(BorderFactory.createTitledBorder("Docker settings"));
		docker_panel.add(new JLabel("Docker directory"));
		docker_directory_field = new JTextField();
		docker_panel.add(docker_directory_field);
		docker_panel.add(new JLabel("Database container name"));
		database_container_field = new JTextField();
		docker_panel.add(database_container_field);
		docker_panel.add(new JLabel("Web server container name"));
		web_server_container_field = new JTextField();
		docker_panel.add(web_server_container_field);

		JPanel web_server_panel = new JPanel(new GridLayout(0, 2, 5, 5));
		web_server_panel.setBorder(BorderFactory.createTitledBorder("Web server configuration"));
		web_server_panel.add(new JLabel("Web server type"));
		web_server_type_combo = new JComboBox<>(new String[] { "Apache" });
		web_server_panel.add(web_server_type_combo);
		web_server_panel.add(new JLabel("Web server port"));
		web_server_port_field = new JTextField();
		web_server_panel.add(web_server_port_field);

		JPanel database_panel = new JPanel(new GridLayout(0, 2, 5, 5));
		database_panel.setBorder(BorderFactory.createTitledBorder("Database configuration"));
		database_panel.add(new JLabel("Database type"));
		database_type_combo = new JComboBox<>(new String[] { "TimeScaleDB" });
		database_panel.add(database_type_combo);
		database_panel.add(new JLabel("Database name"));
		database_name_field = new JTextField();
		database_panel.add(database_name_field);
		database_panel.add(new JLabel("Database port"));
		database_port_field = new JTextField();
		database_panel.add(database_port_field);
		database_panel.add(new JLabel("Database data directory"));
		database_data_directory_field = new JTextField();
		database_panel.add(database_data_directory_field);
		database_panel.add(new JLabel("Database username"));
		database_username_field = new JTextField();
		database_panel.add(database_username_field);
		database_panel.add(new JLabel("Database password"));
		database_password_field = new JPasswordField();
		database_panel.add(database_password_field);

		JPanel button_panel = new JPanel();
		save_button = new JButton("Save configurations");
		save_button.addActionListener(e -> onSaveConfigs());
		button_panel.add(save_button);

		add(credentials_panel);
		add(Box.createVerticalStrut(10));
		add(docker_panel);
		add(Box.createVerticalStrut(10));
		add(web_server_panel);
		add(Box.createVerticalStrut(10));
		add(database_panel);
		add(Box.createVerticalStrut(10));
		add(button_panel);
	}

	private void onSaveConfigs()
	{
		String client_username = client_username_field.getText().trim();
		char[] client_password_characters = client_password_field.getPassword();
		String client_password = new String(client_password_characters);
		Arrays.fill(client_password_characters, ' ');
		String client_host = client_host_field.getText().trim();

		String server_username = server_username_field.getText().trim();
		char[] server_password_characters = server_password_field.getPassword();
		String server_password = new String(server_password_characters);
		Arrays.fill(server_password_characters, ' ');
		String server_host = server_host_field.getText().trim();

		String docker_directory = docker_directory_field.getText().trim();
		String db_container = database_container_field.getText().trim();
		String web_server_container = web_server_container_field.getText().trim();

		String web_server_type = (String) web_server_type_combo.getSelectedItem();
		String web_server_port = web_server_port_field.getText().trim();

		String database_type = (String) database_type_combo.getSelectedItem();
		String database_name = database_name_field.getText().trim();
		String database_port = database_port_field.getText().trim();
		String database_data_directory = database_data_directory_field.getText().trim();
		String database_username = database_username_field.getText().trim();
		char[] database_password_characters = database_password_field.getPassword();
		String database_password = new String(database_password_characters);
		Arrays.fill(database_password_characters, ' ');

		if (client_username.isEmpty() || client_password.isEmpty() || client_host.isEmpty() || server_username.isEmpty()
				|| server_password.isEmpty() || server_host.isEmpty() || docker_directory.isEmpty()
				|| db_container.isEmpty() || web_server_container.isEmpty() || web_server_port.isEmpty()
				|| database_name.isEmpty() || database_port.isEmpty() || database_data_directory.isEmpty()
				|| database_username.isEmpty() || database_password.isEmpty())
		{

			JOptionPane.showMessageDialog(this, "All fields are required. Please fill in all the fields.",
					"Missing data", JOptionPane.ERROR_MESSAGE);
			return;
		}

		Map<String, String> common_properties = new HashMap<>();
		common_properties.put("CLIENT_USERNAME", client_username);
		common_properties.put("CLIENT_PASSWORD", client_password);
		common_properties.put("CLIENT_HOST", client_host);
		common_properties.put("SERVER_USERNAME", server_username);
		common_properties.put("SERVER_PASSWORD", server_password);
		common_properties.put("SERVER_HOST", server_host);
		common_properties.put("DOCKER_DIRECTORY", docker_directory);
		common_properties.put("DATABASE_CONTAINER_NAME", db_container);
		common_properties.put("WEB_SERVER_CONTAINER_NAME", web_server_container);
		common_properties.put("WEB_SERVER_TYPE", web_server_type);
		common_properties.put("WEB_SERVER_PORT", web_server_port);
		common_properties.put("DATABASE_TYPE", database_type);
		common_properties.put("DATABASE_NAME", database_name);
		common_properties.put("DATABASE_PORT", database_port);
		common_properties.put("DATABASE_DATA_DIRECTORY", database_data_directory);
		common_properties.put("DATABASE_USERNAME", database_username);
		common_properties.put("DATABASE_PASSWORD", database_password);

		boolean server_configuration_ok = generateServerConfigurationFile(common_properties);
		boolean client_configuration_ok = generateClientConfigurationFile(common_properties);
		boolean docker_configuration_ok = generateDockerConfigurationFile(common_properties);
		boolean timescale_environment_ok = generateTimeScaleEnvironmentFile(common_properties);
		boolean web_server_data_provider_ok = generateWebServerDataProviderConfigurationFile(common_properties);
		boolean web_server_configuration_ok = generateWebServerConfigurationFile(common_properties);

		if (server_configuration_ok && client_configuration_ok && docker_configuration_ok && timescale_environment_ok
				&& web_server_data_provider_ok && web_server_configuration_ok)
		{
			JOptionPane.showMessageDialog(this, "All configuration files generated successfully.", "Success",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Some configuration files failed to generate.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private boolean generateServerConfigurationFile(Map<String, String> properties)
	{
		try
		{
			String server_host = properties.get("SERVER_HOST");
			String file_name = current_folder.getAbsolutePath() + "/docker/" + server_host.toLowerCase() + DeploymentProperties.SERVER_FILE_PATTERN.toString();
			File file = new File(file_name);
	        File parent_directory = file.getParentFile();
			if (!parent_directory.exists())
			{
				parent_directory.mkdirs();
			}
			Map<String, String> file_properties = new HashMap<>();
			file_properties.put("SERVER_USERNAME", properties.get("SERVER_USERNAME"));
			file_properties.put("SERVER_PASSWORD", properties.get("SERVER_PASSWORD"));
			file_properties.put("SERVER_HOSTNAME", server_host);
			DataStructureHelper.setProperties(file, file_properties);
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}

	private boolean generateClientConfigurationFile(Map<String, String> properties)
	{
		try
		{
			String client_host = properties.get("CLIENT_HOST");
			String file_name = current_folder.getAbsolutePath() + "/client/" + client_host.toLowerCase() + DeploymentProperties.CLIENT_FILE_PATTERN.toString();
			File file = new File(file_name);
	        File parent_directory = file.getParentFile();
			if (!parent_directory.exists())
			{
				parent_directory.mkdirs();
			}
			Map<String, String> file_properties = new HashMap<>();
			file_properties.put("CLIENT_USERNAME", properties.get("CLIENT_USERNAME"));
			file_properties.put("CLIENT_PASSWORD", properties.get("CLIENT_PASSWORD"));
			file_properties.put("CLIENT_HOSTNAME", client_host);
			DataStructureHelper.setProperties(file, file_properties);
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}

	private boolean generateDockerConfigurationFile(Map<String, String> properties)
	{
		try
		{
			String server_host = properties.get("SERVER_HOST");
			String file_name = current_folder.getAbsolutePath() + "/docker/" + server_host.toLowerCase() + "_docker.env";
			File file = new File(file_name);
	        File parent_directory = file.getParentFile();
			if (!parent_directory.exists())
			{
				parent_directory.mkdirs();
			}
			Map<String, String> file_properties = new HashMap<>();
			file_properties.put("DOCKER_DIRECTORY", properties.get("DOCKER_DIRECTORY"));
			file_properties.put("DATA_DIRECTORY", properties.get("DATABASE_DATA_DIRECTORY"));
			file_properties.put("TIME_SCALE_DB_CONTAINER_NAME", properties.get("DATABASE_CONTAINER_NAME"));
			file_properties.put("TIME_SCALE_DB_PORT", properties.get("DATABASE_PORT"));
			file_properties.put("WEB_SERVER_CONTAINER_NAME", properties.get("WEB_SERVER_CONTAINER_NAME"));
			file_properties.put("WEB_SERVER_PORT", properties.get("WEB_SERVER_PORT"));
			DataStructureHelper.setProperties(file, file_properties);
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}

	private boolean generateTimeScaleEnvironmentFile(Map<String, String> properties)
	{
		try
		{
			String database_name = properties.get("DATABASE_NAME");
			String file_name = current_folder.getAbsolutePath() + "/time_scale_db/" + database_name.toLowerCase() + "_database.env";
			File file = new File(file_name);
	        File parent_directory = file.getParentFile();
			if (!parent_directory.exists())
			{
				parent_directory.mkdirs();
			}
			Map<String, String> file_properties = new HashMap<>();
			file_properties.put("POSTGRES_USERNAME", properties.get("DATABASE_USERNAME"));
			file_properties.put("POSTGRES_PASSWORD", properties.get("DATABASE_PASSWORD"));
			file_properties.put("POSTGRES_DB", database_name);
			DataStructureHelper.setProperties(file, file_properties);
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}

	private boolean generateWebServerDataProviderConfigurationFile(Map<String, String> properties)
	{
		try
		{
			String database_name = properties.get("DATABASE_NAME");
			String file_name = current_folder.getAbsolutePath() + "/web_server/" + database_name.toLowerCase() + DeploymentProperties.DATABASE_FILE_PATTERN.toString();
			File file = new File(file_name);
	        File parent_directory = file.getParentFile();
			if (!parent_directory.exists())
			{
				parent_directory.mkdirs();
			}
			Map<String, String> file_properties = new HashMap<>();
			if (properties.get("DATABASE_TYPE").equals("TimeScaleDB"))
			{
				file_properties.put("DBMS", "postgresql");
			}
			file_properties.put("DATABASE_NAME", database_name);
			file_properties.put("DATABASE_HOSTNAME", properties.get("DATABASE_CONTAINER_NAME"));
			file_properties.put("DATABASE_PORT", properties.get("DATABASE_PORT"));
			file_properties.put("DATABASE_USERNAME", properties.get("DATABASE_USERNAME"));
			file_properties.put("DATABASE_PASSWORD", properties.get("DATABASE_PASSWORD"));
			file_properties.put("DATABASE_FETCH_SIZE", "10000");
			DataStructureHelper.setProperties(file, file_properties);
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}

	private boolean generateWebServerConfigurationFile(Map<String, String> properties)
	{
		try
		{
			String server_host = properties.get("SERVER_HOST");
			String file_name = current_folder.getAbsolutePath() + "/web_server/" + server_host.toLowerCase() + DeploymentProperties.WEB_SERVER_FILE_PATTERN.toString();
			File file = new File(file_name);
	        File parent_directory = file.getParentFile();
			if (!parent_directory.exists())
			{
				parent_directory.mkdirs();
			}
			Map<String, String> file_properties = new HashMap<>();
			file_properties.put("WEB_SERVER_TYPE", properties.get("WEB_SERVER_TYPE"));
			file_properties.put("WEB_SERVER_HOSTNAME", server_host);
			file_properties.put("WEB_SERVER_PORT", properties.get("WEB_SERVER_PORT"));
			DataStructureHelper.setProperties(file, file_properties);
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
}
