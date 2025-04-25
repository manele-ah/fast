package fr.ubo.fast.gui.administration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import fr.ubo.fast.client.api.TimeSeriesManagementClient;
import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.constant.DatabaseProperties;
import fr.ubo.fast.common.model.MeasuredVariable;
import fr.ubo.fast.common.model.TimeSeries;

public class TimeSeriesPanel extends JPanel
{
	private JTable time_series_table;
	private DefaultTableModel table_model;
	private JButton add_button;
	private JButton remove_button;
	private JButton import_button;
	private JButton remove_observations_button;
	
	private TimeSeriesManagementClient client;
	
	private static final long serialVersionUID = 7718700292849082050L;

	public TimeSeriesPanel()
	{
		super(new BorderLayout());
		this.client = new TimeSeriesManagementClient("http://localhost:8080" + DataManagerProperties.APP_NAME.toString());

		table_model = new DefaultTableModel(new Object[] { "Name", "Unit", "Period (s)", "Min quality", "Max quality", "Start date", "End date" }, 0)
		{
			private static final long serialVersionUID = 3744275956603885318L;

			@Override
			public boolean isCellEditable(int row, int column)
			{
				return false;
			}
		};
		time_series_table = new JTable(table_model);
		JScrollPane scroll_pane = new JScrollPane(time_series_table);

		JPanel button_panel = new JPanel();
		add_button = new JButton("Add");
		remove_button = new JButton("Remove");
		import_button = new JButton("Import observations");
		remove_observations_button = new JButton("Remove observations");
		button_panel.add(add_button);
		button_panel.add(remove_button);
		button_panel.add(import_button);
		button_panel.add(remove_observations_button);

		add(scroll_pane, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);

		add_button.addActionListener(event -> onAddMeasuredVariable());
		remove_button.addActionListener(event -> onRemoveTimeSeries());
		import_button.addActionListener(event -> onImportObservations());
		remove_observations_button.addActionListener(event -> onRemoveObservations());

		refreshTable();
	}

	private void onAddMeasuredVariable()
	{
		JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
		JTextField name_field = new JTextField();
		JTextField unit_field = new JTextField();
		JTextField period_field = new JTextField();
		JTextField min_quality_field = new JTextField();
		JTextField max_quality_field = new JTextField();

		panel.add(new JLabel("Name"));
		panel.add(name_field);
		panel.add(new JLabel("Unit"));
		panel.add(unit_field);
		panel.add(new JLabel("Period"));
		panel.add(period_field);
		panel.add(new JLabel("Min quality"));
		panel.add(min_quality_field);
		panel.add(new JLabel("Max quality"));
		panel.add(max_quality_field);

		int result = JOptionPane.showConfirmDialog(this, panel, "Add measured variable", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION)
		{
			String name = name_field.getText().trim();
			String unit = unit_field.getText().trim();
			String period_string = period_field.getText().trim();
			String min_quality_string = min_quality_field.getText().trim();
			String max_quality_string = max_quality_field.getText().trim();

			if (name.isEmpty() || unit.isEmpty() || period_string.isEmpty() || min_quality_string.isEmpty() || max_quality_string.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
				
				return;
			}
			
			double period = 0.0;
			int min_quality = 0;
			int max_quality = 0;
			
			try
			{
				period = Double.parseDouble(period_string);
				min_quality = Integer.parseInt(min_quality_string);
				max_quality = Integer.parseInt(max_quality_string);
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(this, "Invalid numeric input.", "Error", JOptionPane.ERROR_MESSAGE);
				
				return;
			}
			
			if (period <= 0 || min_quality >= max_quality)
			{
				JOptionPane.showMessageDialog(this, "Invalid period or quality values.", "Error", JOptionPane.ERROR_MESSAGE);
				
				return;
			}
			
			String response = client.addMeasuredVariable(name, unit, period, min_quality, max_quality);
			JOptionPane.showMessageDialog(this, response);
			refreshTable();
		}
	}

	private void onRemoveTimeSeries()
	{
		int selected_row = time_series_table.getSelectedRow();
		if (selected_row < 0)
		{
			JOptionPane.showMessageDialog(this, "Please select a row to remove.", "Error", JOptionPane.ERROR_MESSAGE);
			
			return;
		}
		
		String name = (String) table_model.getValueAt(selected_row, 0);
		int confirm = JOptionPane.showConfirmDialog(this, "Delete " + name + " time series and all related data?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION)
		{
			String response = client.deleteTimeSeries(name);
			JOptionPane.showMessageDialog(this, response);
			refreshTable();
		}
	}

	private void onImportObservations()
	{
		int selected_row = time_series_table.getSelectedRow();
		if (selected_row < 0)
		{
			JOptionPane.showMessageDialog(this, "Please select a row first.", "Error", JOptionPane.ERROR_MESSAGE);
			
			return;
		}
		
		String name = (String) table_model.getValueAt(selected_row, 0);

		String[] choices = { "Local file", "Server file path" };
		String choice = (String) JOptionPane.showInputDialog(this, "Where are the observations stored?", "Import observations for " + name, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

		if (choice == null)
		{
			return;
		}

		if (choice.equals("Local file"))
		{
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
			chooser.setFileFilter(filter);

			int return_value = chooser.showOpenDialog(this);
			if (return_value == JFileChooser.APPROVE_OPTION)
			{
				File chosen = chooser.getSelectedFile();
				
				String response = client.addObservations(name, chosen.getAbsolutePath());
				JOptionPane.showMessageDialog(this, response);
				refreshTable();
			}
		}
		else if (choice.equals("Server file path"))
		{
			JPanel panel = new JPanel(new BorderLayout(5, 5));
			JTextField field_path = new JTextField(30);
			panel.add(new JLabel("Server file path"), BorderLayout.NORTH);
			panel.add(field_path, BorderLayout.CENTER);

			int result = JOptionPane.showConfirmDialog(this, panel, "Import observations for " + name, JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION)
			{
				String distant_path = field_path.getText().trim();
				if (distant_path.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "File path is required.", "Error", JOptionPane.ERROR_MESSAGE);
					
					return;
				}

				String response = client.addObservations(name, distant_path);
				JOptionPane.showMessageDialog(this, response);
				refreshTable();
			}
		}
	}


	private void onRemoveObservations()
	{
		int selected_row = time_series_table.getSelectedRow();
		if (selected_row < 0)
		{
			JOptionPane.showMessageDialog(this, "Please select a row first.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		String name = (String) table_model.getValueAt(selected_row, 0);

		String start_date_string = (String) table_model.getValueAt(selected_row, 5);
		String end_date_string = (String) table_model.getValueAt(selected_row, 6);

		JSpinner spinner_start = createDateTimeSpinner(start_date_string);
		JSpinner spinner_end = createDateTimeSpinner(end_date_string);

		JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
		panel.add(new JLabel("Time series name"));
		panel.add(new JLabel(name));
		panel.add(new JLabel("Start time"));
		panel.add(spinner_start);
		panel.add(new JLabel("End time"));
		panel.add(spinner_end);

		int result = JOptionPane.showConfirmDialog(this, panel, "Remove observations for " + name, JOptionPane.OK_CANCEL_OPTION);

		if (result == JOptionPane.OK_OPTION)
		{
			Date date_start = (Date) spinner_start.getValue();
			Date date_end = (Date) spinner_end.getValue();

			OffsetDateTime start_date_time = dateToOffsetDateTime(date_start);
			OffsetDateTime end_date_time = dateToOffsetDateTime(date_end);

			String response = client.deleteObservations(name, start_date_time, end_date_time);
			JOptionPane.showMessageDialog(this, response);
			refreshTable();
		}
	}
	
	private JSpinner createDateTimeSpinner(String string_date_time)
	{
		SpinnerDateModel model = new SpinnerDateModel();
		JSpinner spinner = new JSpinner(model);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "yyyy-MM-dd HH:mm:ss");
		spinner.setEditor(editor);

		try
		{
			if (string_date_time != null && !string_date_time.equals("???"))
			{
				OffsetDateTime offset_date_time = OffsetDateTime.parse(string_date_time);
				Instant instant = offset_date_time.toInstant();
				Date date = Date.from(instant);
				spinner.setValue(date);
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}
		
		return spinner;
	}
	
	private void refreshTable()
	{
		try
		{
			String measured_variables_raw = stripHttpPrefix(client.getAllMeasuredVariables());
			String time_series_raw = stripHttpPrefix(client.getAllTimeSeries());

			ObjectMapper mapper = new ObjectMapper();
			mapper.registerModule(new JavaTimeModule());
			mapper.setPropertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE);

			List<MeasuredVariable> measured_variable_list = mapper.readValue(measured_variables_raw, new TypeReference<List<MeasuredVariable>>()
			{
			});
			List<TimeSeries> time_series_list = mapper.readValue(time_series_raw, new TypeReference<List<TimeSeries>>()
			{
			});

			Map<Integer, MeasuredVariable> measured_variables_map = new HashMap<>();
			for (MeasuredVariable measured_variable : measured_variable_list)
			{
				measured_variables_map.put(measured_variable.getId(), measured_variable);
			}

			table_model.setRowCount(0);
			
			for (TimeSeries time_series : time_series_list)
			{
				int measured_variable_id = time_series.getMeasuredVariableId();
				MeasuredVariable measured_variable = measured_variables_map.get(measured_variable_id);

				String name = (measured_variable != null) ? measured_variable.getName() : "???";
				String unit = (measured_variable != null) ? measured_variable.getUnit() : "???";
				double period = time_series.getPeriod();
				int min_quality = time_series.getMinQuality();
				int max_quality = time_series.getMaxQuality();
				String start_date_string = "???";
				String end_date_string = "???";
				if (time_series.getStartDate() != null)
				{
					start_date_string = time_series.getStartDate().toInstant().atZone(ZoneId.of(DatabaseProperties.ZONE_ID.toString())).toOffsetDateTime().toString();
				}
				if (time_series.getStartDate() != null)
				{
					end_date_string = time_series.getEndDate().toInstant().atZone(ZoneId.of(DatabaseProperties.ZONE_ID.toString())).toOffsetDateTime().toString();
				}

				table_model.addRow(new Object[] { name, unit, period, min_quality, max_quality, start_date_string, end_date_string });
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error parsing JSON: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private OffsetDateTime dateToOffsetDateTime(Date date)
	{
		if (date == null)
		{
			return OffsetDateTime.now();
		}
		Instant instant = date.toInstant();
		
		return instant.atZone(ZoneId.of(DatabaseProperties.ZONE_ID.toString())).toOffsetDateTime();
	}
	
	private String stripHttpPrefix(String raw)
	{
		if (raw.startsWith("HTTP 200:"))
		{
			return raw.substring("HTTP 200:".length()).trim();
		}
		
		return raw;
	}
}
