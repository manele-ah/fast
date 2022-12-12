package fr.ubo.fast.viewer.app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * {@link ChartPanel} is a container used for displaying a {@link Chart}.
 */
public class ChartPanel extends JPanel
{
	/** The {@link Chart} that will be displayed within the JPanel. */
	private Chart chart;
	
	/** UID used for serialization purposes. */
	private static final long serialVersionUID = 1254669429194130311L;

	public ChartPanel(Chart chart)
	{
		this.chart = chart;
		this.chart.setParent(this);
	}

	@Override
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		if (this.chart == null)
		{
			return;
		}

		Graphics2D graphics_2d = (Graphics2D) graphics.create();
		
		Dimension size = getSize();
		Insets insets = getInsets();
		Rectangle2D available = new Rectangle2D.Double(insets.left, insets.top, size.getWidth() - insets.left - insets.right, size.getHeight() - insets.top - insets.bottom);

		Rectangle2D chart_area = available;

		AffineTransform previous_transform = graphics_2d.getTransform();
		graphics_2d.translate(insets.left, insets.top);
		this.chart.draw(graphics_2d, chart_area);
		
		graphics_2d.setTransform(previous_transform);
		graphics_2d.dispose();
	}
}
