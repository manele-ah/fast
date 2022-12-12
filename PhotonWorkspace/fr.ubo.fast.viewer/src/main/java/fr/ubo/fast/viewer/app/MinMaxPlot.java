package fr.ubo.fast.viewer.app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import fr.ubo.fast.viewer.constants.NordTheme;
import fr.ubo.fast.viewer.constants.Position;

/**
 * A {@link MinMaxPlot} is a plot that displays a time series min max values in the form of vertical lines.
 */
public class MinMaxPlot extends Plot
{
	/** The time axis. */
	private Axis time_axis;
	/** The value axis. */
	private Axis value_axis;
	/** The position of the time axis. */
	private Position time_axis_position;
	/** The position of the value axis. */
	private Position value_axis_position;
	/** The dataset that will be plotted. The key of the map represents the timestamp, and the value (The double array)
	 * represents the min max values. */
	private TreeMap<OffsetDateTime, Double[]> dataset;
	
	/** The color and stroke settings. */
	private Paint item_color;
	private Stroke item_stroke;
	
	/** The default color and stroke settings. */
	public static final Paint DEFAULT_ITEM_COLOR = Color.decode(NordTheme.FOCUS_COLOR.toString());
	public static final Stroke DEFAULT_ITEM_STROKE = new BasicStroke(1.0f);
	
	public MinMaxPlot(Axis time_axis, Axis value_axis, TreeMap<OffsetDateTime, Double[]> dataset)
	{
		super();
		this.time_axis = time_axis;
		this.time_axis_position = Position.BOTTOM;
		this.value_axis = value_axis;
		this.value_axis_position = Position.LEFT;
		this.dataset = dataset;
		
		this.item_color = DEFAULT_ITEM_COLOR;
		this.item_stroke = DEFAULT_ITEM_STROKE;
	}
	
	@Override
	@SuppressWarnings("unused")
	public void draw(Graphics2D graphics, Rectangle2D plot_area)
	{
		double time_axis_space = time_axis.calculateAxisArea(graphics, time_axis_position);
		double value_axis_space = value_axis.calculateAxisArea(graphics, value_axis_position);
		// System.out.println("Area 1 " + time_axis_space + " Area 2 " + value_axis_space);
		Rectangle2D data_area = new Rectangle2D.Double();
		int padding_right = (int) value_axis_space;
		data_area.setRect((int) (plot_area.getX() + value_axis_space), (int) plot_area.getY(),
				(int) (plot_area.getWidth() - value_axis_space - padding_right),
				(int) (plot_area.getHeight() - time_axis_space));

		// Previous data_area > Current data_area
		int x = (int) (data_area.getX() + (data_area.getWidth() - time_axis.getMaxPixelsNumber()) / 2.0);
		int y = (int) (data_area.getY() + (data_area.getHeight() - value_axis.getMaxPixelsNumber()) / 2.0);
		data_area.setRect(x, y, time_axis.getMaxPixelsNumber(), value_axis.getMaxPixelsNumber());
		// To do : The other situation ?
				
		drawBackground(graphics, data_area);
		double cursor = data_area.getMaxY();
		double updated_cursor = time_axis.draw(graphics, cursor, data_area, time_axis_position);
		cursor = data_area.getMinX();
		updated_cursor = value_axis.draw(graphics, cursor, data_area, value_axis_position);
		
		// Draw markers ?
		render(graphics, data_area);
		drawOutline(graphics, data_area);

	}

	public void render(Graphics2D graphics, Rectangle2D data_area)
	{
		if (dataset.size() > time_axis.getMaxPixelsNumber())
		{
			Line2D line = new Line2D.Double();

			for (Map.Entry<OffsetDateTime, Double[]> entry : dataset.entrySet())
			{
				OffsetDateTime x = entry.getKey();
				double y_min = entry.getValue()[0];
				double y_max = entry.getValue()[1];
		        double transformed_x = time_axis.valueToCoordinate(x, data_area, time_axis_position);
		        double transformed_y_min = value_axis.valueToCoordinate(y_min, data_area, value_axis_position);
		        double transformed_y_max = value_axis.valueToCoordinate(y_max, data_area, value_axis_position);
		        
		        line.setLine(transformed_x, transformed_y_min, transformed_x, transformed_y_max);
		        graphics.setStroke(item_stroke);
		        graphics.setPaint(item_color);
		        graphics.draw(line);
			}
		}
		else
		{
			Line2D line = new Line2D.Double();
			
			Map.Entry<OffsetDateTime, Double[]> entry_1 = dataset.firstEntry();
			OffsetDateTime x_1 = entry_1.getKey();
			double y_1 = entry_1.getValue()[0];
			double transformed_x_1 = time_axis.valueToCoordinate(x_1, data_area, time_axis_position);
	        double transformed_y_1 = value_axis.valueToCoordinate(y_1, data_area, value_axis_position);
	        
	        Iterator<Map.Entry<OffsetDateTime, Double[]>> iterator = dataset.entrySet().iterator();
	        if (dataset.size() > 0)
	        {
	        	iterator.next();
	        	while (iterator.hasNext())
	        	{
	        		Map.Entry<OffsetDateTime, Double[]> entry = iterator.next();
	        		OffsetDateTime x_2 = entry.getKey();
					double y_2 = entry.getValue()[0];
					double transformed_x_2 = time_axis.valueToCoordinate(x_2, data_area, time_axis_position);
			        double transformed_y_2 = value_axis.valueToCoordinate(y_2, data_area, value_axis_position);
			        
			        line.setLine(transformed_x_1, transformed_y_1, transformed_x_2, transformed_y_2);
			        graphics.setStroke(item_stroke);
			        graphics.setPaint(item_color);
			        graphics.draw(line);
			        
			        transformed_x_1 = transformed_x_2;
			        transformed_y_1 = transformed_y_2;
	        	}
	        }
		}
	}

	public void drawBackground(Graphics2D graphics, Rectangle2D area)
	{
		fillBackground(graphics, area);
	}
	
	public Axis getTimeAxis()
	{
		return time_axis;
	}

	public void setTimeAxis(Axis time_axis)
	{
		this.time_axis = time_axis;
	}

	public Axis getValueAxis()
	{
		return value_axis;
	}

	public void setValueAxis(Axis value_axis)
	{
		this.value_axis = value_axis;
	}

	public void setDataset(TreeMap<OffsetDateTime, Double[]> dataset)
	{
		if (dataset.size() > 0)
		{
			this.dataset = dataset;
			if (this.chart.getParent() != null)
			{
				ChartPanel parent = this.chart.getParent();
				parent.repaint();
				/*
				Graphics graphics = parent.getGraphics();
				Graphics2D graphics_2d = (Graphics2D) graphics.create();
				
				Dimension size = parent.getSize();
				Insets insets = parent.getInsets();
				Rectangle2D available = new Rectangle2D.Double(insets.left, insets.top, size.getWidth() - insets.left - insets.right, size.getHeight() - insets.top - insets.bottom);

				Rectangle2D chart_area = available;

				AffineTransform previous_transform = graphics_2d.getTransform();
				graphics_2d.translate(insets.left, insets.top);
				
				double x = chart_area.getX();
				double y = chart_area.getY();
				double width = chart_area.getWidth();
				double height = chart_area.getHeight();
				
				if (this.chart.getTitle() != null && this.chart.getTitle().isVisible())
				{
					Rectangle2D title_area = new Rectangle2D.Double();
					if (this.chart.getTitle().getPosition() == Position.TOP)
					{
						// Padding hard-coded
						title_area.setRect(x, y, chart_area.getWidth(), this.chart.getTitle().getSize().getHeight() + 40);
						y += title_area.getHeight();
						height -= title_area.getHeight();
					}
				}

				Rectangle2D plot_area = new Rectangle2D.Double();
				plot_area.setRect(x, y, width, height);
				draw(graphics_2d, plot_area);
				
				graphics_2d.setTransform(previous_transform);
				graphics_2d.dispose();
				*/
			}
		}
	}
}
