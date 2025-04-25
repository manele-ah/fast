package fr.ubo.fast.gui.configuration;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;

public class AggregationConfigurator extends JFrame
{
	private static final long serialVersionUID = 7316920509385155372L;

	public AggregationConfigurator()
	{
		super("FaST Aggregation Configurator");
		
		AggregationConfigurationPanel panel = new AggregationConfigurationPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		getContentPane().add(panel, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() ->
		{
			FlatLightFlatIJTheme.setup();

			new AggregationConfigurator().setVisible(true);
		});
	}
}
