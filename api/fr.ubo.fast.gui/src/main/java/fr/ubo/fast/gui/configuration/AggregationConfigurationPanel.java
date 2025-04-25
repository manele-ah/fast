package fr.ubo.fast.gui.configuration;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import fr.ubo.fast.client.api.AggregationConfigurationClient;
import fr.ubo.fast.client.api.TimeSeriesManagementClient;
import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.constant.DatabaseProperties;
import fr.ubo.fast.common.constant.PerformanceProfileProperties;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.CalendarScale;
import fr.ubo.fast.common.model.FactorScale;
import fr.ubo.fast.common.model.Scale;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.gui.administration.ConfigurationPanel;

public class AggregationConfigurationPanel extends JPanel
{
	private JTextField name_field;
	private JSpinner start_spinner;
	private JSpinner end_spinner;
	private List<JCheckBox> aggregation_check_boxes;
	private JTextField values_number_field;
	private JTextField time_milliseconds_field;
	private JComboBox<String> scale_type_combo;

	private JPanel scale_card_panel;
	private CardLayout scale_card_layout;

	private JPanel factor_panel;
	private JTextField factor_field;
	private JTextField factor_max_num_field;

	private JPanel calendar_panel;
	private JTable calendar_table;
	private DefaultTableModel calendar_table_model;

	private TimeSeriesManagementClient time_series_client;
	private AggregationConfigurationClient configuration_client;
	
	private File current_jar_file;
	private File current_folder;
	
	private static final long serialVersionUID = 3763224869783298730L;

	public AggregationConfigurationPanel()
	{
		super(new BorderLayout(10, 10));
		
		try
		{
			current_jar_file = new File(ConfigurationPanel.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			current_folder = current_jar_file.getParentFile();
		}
		catch (URISyntaxException exception)
		{
			exception.printStackTrace();
		}

		this.configuration_client = new AggregationConfigurationClient("http://localhost:8080" + DataManagerProperties.APP_NAME.toString());
		this.time_series_client = new TimeSeriesManagementClient("http://localhost:8080" + DataManagerProperties.APP_NAME.toString());
		
		name_field = new JTextField(20);

		start_spinner = new JSpinner(new SpinnerDateModel());
		end_spinner = new JSpinner(new SpinnerDateModel());

		JSpinner.DateEditor start_editor = new JSpinner.DateEditor(start_spinner, "yyyy-MM-dd'T'HH:mm:ssXXX");
		start_spinner.setEditor(start_editor);
		JSpinner.DateEditor end_editor = new JSpinner.DateEditor(end_spinner, "yyyy-MM-dd'T'HH:mm:ssXXX");
		end_spinner.setEditor(end_editor);

		values_number_field = new JTextField("5", 5);

		time_milliseconds_field = new JTextField("250.0", 5);

		scale_type_combo = new JComboBox<>(new String[] { "FactorScale", "CalendarScale" });
		scale_type_combo.addActionListener(event -> onScaleTypeChanged());

		JPanel top_panel = new JPanel(new GridLayout(0, 2, 5, 5));
		top_panel.add(new JLabel("Measured variable name"));
		top_panel.add(name_field);

		top_panel.add(new JLabel("Start time"));
		top_panel.add(start_spinner);

		top_panel.add(new JLabel("End time"));
		top_panel.add(end_spinner);

		top_panel.add(new JLabel("Values number"));
		top_panel.add(values_number_field);

		top_panel.add(new JLabel("Time (ms)"));
		top_panel.add(time_milliseconds_field);

		top_panel.add(new JLabel("Scale type"));
		top_panel.add(scale_type_combo);

		aggregation_check_boxes = new ArrayList<>();
		for (AggregationType aggregation : EnumSet.allOf(AggregationType.class))
		{
			if (aggregation == AggregationType.RAW)
			{
				continue;
			}
			JCheckBox check = new JCheckBox(aggregation.name());
			aggregation_check_boxes.add(check);
		}

		JPanel aggregations_wrapper = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		aggregations_wrapper.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
				"Aggregation types", TitledBorder.LEFT, TitledBorder.TOP));
		for (JCheckBox box : aggregation_check_boxes)
		{
			aggregations_wrapper.add(box);
		}

		factor_panel = new JPanel(new GridLayout(2, 2, 5, 5));
		factor_panel.add(new JLabel("Factor"));
		factor_field = new JTextField("2");
		factor_panel.add(factor_field);

		factor_panel.add(new JLabel("Number of zoom levels"));
		factor_max_num_field = new JTextField("5");
		factor_panel.add(factor_max_num_field);

		calendar_panel = new JPanel(new BorderLayout(5, 5));
		calendar_panel.setBorder(null);

		calendar_table_model = new DefaultTableModel(new Object[] { "Unit", "Factor" }, 0);
		calendar_table = new JTable(calendar_table_model);

		JComboBox<String> unit_combo = new JComboBox<>(
				new String[] { "Millisecond", "Second", "Minute", "Hour", "Day", "Month", "Year" });
		calendar_table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(unit_combo));

		JScrollPane table_scroll = new JScrollPane(calendar_table);
		calendar_panel.add(table_scroll, BorderLayout.CENTER);

		JButton add_row_button = new JButton("Add row");
		add_row_button.addActionListener(event ->
		{
			calendar_table_model.addRow(new Object[] { "Day", "1" });
		});
		calendar_panel.add(add_row_button, BorderLayout.SOUTH);

		scale_card_layout = new CardLayout();
		scale_card_panel = new JPanel(scale_card_layout);
		scale_card_panel.add(factor_panel, "FactorScale");
		scale_card_panel.add(calendar_panel, "CalendarScale");

		onScaleTypeChanged();

		JPanel middle_panel = new JPanel();
		middle_panel.setLayout(new BoxLayout(middle_panel, BoxLayout.Y_AXIS));

		middle_panel.add(aggregations_wrapper);
		middle_panel.add(Box.createVerticalStrut(10));
		middle_panel.add(scale_card_panel);

		JButton configure_button = new JButton("Deploy");
		configure_button.addActionListener(event -> onConfigure());
		JPanel bottom_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		bottom_panel.add(configure_button);

		add(top_panel, BorderLayout.NORTH);
		add(middle_panel, BorderLayout.CENTER);
		add(bottom_panel, BorderLayout.SOUTH);
	}

	private void onScaleTypeChanged()
	{
		String selected = (String) scale_type_combo.getSelectedItem();
		scale_card_layout.show(scale_card_panel, selected);
	}

	private boolean generatePerformanceProfile(File file, String name, int values_number, double user_time, String scale_type, Scale scale)
	{
		try
		{
			Map<String, String> properties = new HashMap<>();

			properties.put(PerformanceProfileProperties.TIME_SERIES_NAME.toString(), name);
			properties.put(PerformanceProfileProperties.VALUES_NUMBER.toString(), String.valueOf(values_number));
			properties.put(PerformanceProfileProperties.USER_TIME.toString(), String.valueOf(user_time));

			properties.put(PerformanceProfileProperties.PING_TIME.toString(), "0.0");
			properties.put(PerformanceProfileProperties.RAW_DATA_THRESHOLD.toString(), "0.0");
			properties.put(PerformanceProfileProperties.PRE_COMPUTED_DATA_THRESHOLD.toString(), "0.0");

			properties.put(PerformanceProfileProperties.SCALE_TYPE.toString(), scale_type);
			if ("FactorScale".equals(scale_type) && scale instanceof FactorScale)
			{
				FactorScale factor_scale = (FactorScale) scale;
				properties.put(PerformanceProfileProperties.SCALE_FACTOR.toString(), String.valueOf(factor_scale.getFactor()));
				properties.put(PerformanceProfileProperties.SCALE_ZOOMS_NUMBER.toString(), String.valueOf(factor_scale.getValuesMaximumNumber()));
			}
			else if ("CalendarScale".equals(scale_type) && scale instanceof CalendarScale)
			{
				CalendarScale calendar_scale = (CalendarScale) scale;
				ChronoUnit[] units = calendar_scale.getUnits();
				long[] factors = calendar_scale.getFactors();

				StringBuilder factor_string_builder = new StringBuilder();
				StringBuilder period_string_builder = new StringBuilder();
				for (int i = 0; i < units.length; i++)
				{
					factor_string_builder.append(factors[i]);
					period_string_builder.append(DataStructureHelper.convertChronoUnitToString(units[i]));
					if (i < units.length - 1)
					{
						factor_string_builder.append(",");
						period_string_builder.append(",");
					}
				}
				properties.put(PerformanceProfileProperties.SCALE_FACTORS.toString(), factor_string_builder.toString());
				properties.put(PerformanceProfileProperties.SCALE_PERIODS.toString(), period_string_builder.toString());
			}

			File parent = file.getParentFile();
			if (!parent.exists())
			{
				parent.mkdirs();
			}
			DataStructureHelper.setProperties(file, properties);

			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}

	private void onConfigure()
	{
		String name = name_field.getText().trim();
		if (name.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Name is required.", "Error", JOptionPane.ERROR_MESSAGE);
			
			return;
		}
		
		String time_series_raw = stripHttpPrefix(time_series_client.getTimeSeries(name));
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.setPropertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE);
		
		TimeSeries time_series = null;

		try
		{
			time_series = mapper.readValue(time_series_raw, new TypeReference<TimeSeries>()
			{
			});
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error parsing JSON: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			
			return;
		}

		Date start_date = (Date) start_spinner.getValue();
		Date end_date = (Date) end_spinner.getValue();
		OffsetDateTime start_date_time = dateToOffsetDateTime(start_date);
		OffsetDateTime end_date_time = dateToOffsetDateTime(end_date);

		int values_number;
		try
		{
			values_number = Integer.parseInt(values_number_field.getText().trim());
		}
		catch (NumberFormatException exception)
		{
			JOptionPane.showMessageDialog(this, "Invalid values number.", "Error", JOptionPane.ERROR_MESSAGE);
			
			return;
		}

		double user_time;
		try
		{
			user_time = Double.parseDouble(time_milliseconds_field.getText().trim());
		}
		catch (NumberFormatException exception)
		{
			JOptionPane.showMessageDialog(this, "Invalid user time.", "Error", JOptionPane.ERROR_MESSAGE);
			
			return;
		}

		List<AggregationType> chosen_aggregations = new ArrayList<>();
		for (JCheckBox box : aggregation_check_boxes)
		{
			if (box.isSelected())
			{
				try
				{
					AggregationType type = AggregationType.valueOf(box.getText().trim().toUpperCase());
					chosen_aggregations.add(type);
				}
				catch (Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}
		if (chosen_aggregations.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Choose at least one aggregation type.", "Error",
					JOptionPane.ERROR_MESSAGE);
			
			return;
		}

		Scale chosen_scale = null;
		String scale_type = (String) scale_type_combo.getSelectedItem();
		
		switch (scale_type)
		{
			case "FactorScale":
			{
				int factor;
				int max_number;
				try
				{
					factor = Integer.parseInt(factor_field.getText().trim());
					max_number = Integer.parseInt(factor_max_num_field.getText().trim());
				}
				catch (NumberFormatException exception)
				{
					JOptionPane.showMessageDialog(this, "Invalid factor or number of zoom levels.", "Error",
							JOptionPane.ERROR_MESSAGE);
					
					return;
				}
				FactorScale scale = new FactorScale(factor, max_number);
				if (time_series != null)
				{
					scale.computeValues(time_series);
				}
				chosen_scale = scale;
				
				break;
			}
			case "CalendarScale":
			{
				int row_count = calendar_table.getRowCount();
				if (row_count == 0)
				{
					JOptionPane.showMessageDialog(this, "At least one zoom level is required.",
							"Error", JOptionPane.ERROR_MESSAGE);
					
					return;
				}
				else
				{
					ChronoUnit[] units = new ChronoUnit[row_count];
					long[] factors = new long[row_count];
					for (int i = 0; i < row_count; i++)
					{
						String unit_string = (String) calendar_table.getValueAt(i, 0);
						String factor_string = (String) calendar_table.getValueAt(i, 1);
						try
						{
							units[i] = DataStructureHelper.convertStringToChronoUnit(unit_string.trim());
							factors[i] = Long.parseLong(factor_string.trim());
						}
						catch (Exception exception)
						{
							JOptionPane.showMessageDialog(this, "Invalid row in CalendarScale table.",
									"Error", JOptionPane.ERROR_MESSAGE);
							
							return;
						}
					}
					
					CalendarScale scale = new CalendarScale(units, factors);
					scale.computeValues();
					chosen_scale = scale;
				}
				
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(this, "Unknown scale type.", "Error", JOptionPane.ERROR_MESSAGE);
	
				return;
			}
		}

		String response = configuration_client.configureAggregations(name, start_date_time, end_date_time, chosen_aggregations, values_number, chosen_scale);
		JOptionPane.showMessageDialog(this, response);
	
		String file_name = current_folder.getAbsolutePath() + "/client/profile.properties";
		boolean generated = generatePerformanceProfile(new File(file_name), name, values_number, user_time, scale_type, chosen_scale);
		if (!generated)
		{
			JOptionPane.showMessageDialog(this, "Configuration file failed to generate.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void setTimeSeriesDateRange(OffsetDateTime start, OffsetDateTime end)
	{
		if (start != null)
		{
			Date date = Date.from(start.toInstant());
			start_spinner.setValue(date);
		}
		if (end != null)
		{
			Date date = Date.from(end.toInstant());
			end_spinner.setValue(date);
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
