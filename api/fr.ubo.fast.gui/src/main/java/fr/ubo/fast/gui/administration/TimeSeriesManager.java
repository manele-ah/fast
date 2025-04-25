package fr.ubo.fast.gui.administration;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;

public class TimeSeriesManager extends JFrame
{
	private JTabbedPane tabbed_pane;
	
	private static final long serialVersionUID = 8943980164938219730L;

	public TimeSeriesManager()
	{
		super("FaST Time Series Manager");
		
		tabbed_pane = new JTabbedPane();
		
		ConfigurationPanel configuration_panel = new ConfigurationPanel();
		TimeSeriesPanel time_series_panel = new TimeSeriesPanel();

		JPanel configuration_wrapper = new JPanel(new BorderLayout());
		configuration_wrapper.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		configuration_wrapper.add(configuration_panel, BorderLayout.CENTER);

		JPanel time_series_wrapper = new JPanel(new BorderLayout());
		time_series_wrapper.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		time_series_wrapper.add(time_series_panel, BorderLayout.CENTER);

		tabbed_pane.addTab("Configuration", configuration_wrapper);
		tabbed_pane.addTab("Time Series Management", time_series_wrapper);

		getContentPane().add(tabbed_pane, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() ->
		{
			FlatLightFlatIJTheme.setup();

			new TimeSeriesManager().setVisible(true);
		});
	}
}
