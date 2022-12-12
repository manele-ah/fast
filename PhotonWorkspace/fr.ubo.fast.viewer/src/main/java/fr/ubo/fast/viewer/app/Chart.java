package fr.ubo.fast.viewer.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

import fr.ubo.fast.viewer.constants.NordTheme;
import fr.ubo.fast.viewer.constants.Position;

/**
 * A {@link Chart} is the area in which the plot and the title of the chart are drawn.
 */
public class Chart
{
	/** The title of the chart. */
	private Title title;
	// private ArrayList<Legend> legends;
	/** The plot that holds the chart data. */
	private Plot plot;
	/** Parent panel. */
	private ChartPanel parent;
	
	/** The background color of the chart. */
	private Paint background_color;
	
	/** The default background color of the chart. */
	private static final Paint DEFAULT_BACKGROUND_COLOR = Color.decode(NordTheme.BACKGROUND_COLOR.toString());
	
	public Chart(Plot plot)
	{
		this((Title) null, plot);
	}
	
	public Chart(String title, Plot plot)
	{
		this(new Title(title), plot);
	}
	
	public Chart(String title, Font font, Plot plot)
	{
		this(new Title(title, font), plot);
	}
	
	public Chart(Title title, Plot plot)
	{
		this.title = title;
		this.plot = plot;
		this.plot.setChart(this);
		this.background_color = DEFAULT_BACKGROUND_COLOR;
	}
	
	public void draw(Graphics2D graphics, Rectangle2D chart_area)
	{
		double x = chart_area.getX();
		double y = chart_area.getY();
		double width = chart_area.getWidth();
		double height = chart_area.getHeight();
		
		graphics.setPaint(background_color);
		graphics.fill(chart_area);
		
		if (title != null && title.isVisible())
		{
			Rectangle2D title_area = new Rectangle2D.Double();
			title.setSize(graphics);
			if (title.getPosition() == Position.TOP)
			{
				// Padding hard-coded
				title_area.setRect(x, y, chart_area.getWidth(), title.getSize().getHeight() + 40);
				title.draw(graphics, title_area);
				y += title_area.getHeight();
				height -= title_area.getHeight();
			}
		}

		Rectangle2D plot_area = new Rectangle2D.Double();
		plot_area.setRect(x, y, width, height);
		plot.draw(graphics, plot_area);
	}

	public Title getTitle()
	{
		return title;
	}

	public void setTitle(Title title)
	{
		this.title = title;
	}

	public Plot getPlot()
	{
		return plot;
	}

	public void setPlot(Plot plot)
	{
		this.plot = plot;
	}

	public ChartPanel getParent()
	{
		return parent;
	}

	public void setParent(ChartPanel parent)
	{
		this.parent = parent;
	}
}
