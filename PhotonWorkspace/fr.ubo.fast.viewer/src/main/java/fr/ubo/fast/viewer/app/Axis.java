package fr.ubo.fast.viewer.app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.LineMetrics;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

import fr.ubo.fast.common.utility.DrawingHelper;
import fr.ubo.fast.viewer.constants.NordTheme;
import fr.ubo.fast.viewer.constants.Position;
import fr.ubo.fast.viewer.constants.ValueType;

/**
 * The class {@link Axis} defines the vertical and horizontal axes used for displaying chart values.
 */
public class Axis
{
	/** The axis label. */
	private String axis_label;
	/** The list of values to be displayed. */
	private ArrayList<Pixel> pixels;
	/** The axis minimum value. */
	private Object lower_bound;
	/** The axis maximum value. */
	private Object upper_bound;
	/** The interval that a pixel defines (It depends on values type, it can be an interval of doubles or an
	 * interval of time). */
	private Object pixel_interval;
	/** The axis values type. For now, only {@link ValueType#DATE} and {@link ValueType#DOUBLE} are supported. */
	private ValueType value_type;
	/** The width or the height of the plot. */
	private int max_pixels_number;
	/** The "length" of a tick. */
	private int displayed_step;
	
	/** The formatters used for displaying values. */
	private NumberFormat number_formatter = DecimalFormat.getInstance();
	private DateTimeFormatter date_time_formatter;
	
	/** The font, color and stroke settings. */
	private Font axis_label_font;
	private Font tick_label_font;
	private Paint axis_label_color;
	private Paint axis_line_color;
	private Paint tick_label_color;
	private Paint tick_mark_color;
	private Stroke axis_line_stroke;
	private Stroke tick_mark_stroke;
	
	/** The default font, color and stroke settings. */
	private static final Font DEFAULT_AXIS_LABEL_FONT = new Font("SansSerif", Font.BOLD, 13);
	private static final Font DEFAULT_TICK_LABEL_FONT = new Font("SansSerif", Font.PLAIN, 11);
	private static final Paint DEFAULT_AXIS_LABEL_COLOR = Color.decode(NordTheme.TEXT_FOREGROUND_COLOR.toString());
	private static final Paint DEFAULT_AXIS_LINE_COLOR = Color.GRAY;
	private static final Paint DEFAULT_TICK_LABEL_COLOR = Color.decode(NordTheme.TEXT_FOREGROUND_COLOR.toString());
	private static final Paint DEFAULT_TICK_MARK_COLOR = Color.GRAY;
	private static final Stroke DEFAULT_AXIS_LINE_STROKE = new BasicStroke(0.5f);
	private static final Stroke DEFAULT_TICK_MARK_STROKE = new BasicStroke(0.5f);
	
	public Axis(String axis_label, Object lower_bound, Object upper_bound, ValueType value_type, int max_pixels_number, int displayed_step)
	{
		this.axis_label = axis_label;
		this.pixels = new ArrayList<Pixel>();
		this.lower_bound = lower_bound;
		this.upper_bound = upper_bound;
		this.value_type = value_type;
		this.max_pixels_number = max_pixels_number;
		this.displayed_step = Math.round(max_pixels_number / displayed_step);
		
		calculatePixelInterval();
		
		this.axis_label_font = DEFAULT_AXIS_LABEL_FONT;
		this.tick_label_font = DEFAULT_TICK_LABEL_FONT;
		this.axis_label_color = DEFAULT_AXIS_LABEL_COLOR;
		this.axis_line_color = DEFAULT_AXIS_LINE_COLOR;
		this.tick_label_color = DEFAULT_TICK_LABEL_COLOR;
		this.tick_mark_color = DEFAULT_TICK_MARK_COLOR;
		this.axis_line_stroke = DEFAULT_AXIS_LINE_STROKE;
		this.tick_mark_stroke = DEFAULT_TICK_MARK_STROKE;
	}
	
	/**
	 * The pixel interval is computed based on the values bounds.
	 */
	public void calculatePixelInterval()
	{
		if (value_type == ValueType.DOUBLE)
		{
			this.pixel_interval = ((double) this.upper_bound - (double) this.lower_bound) / this.max_pixels_number;
			this.lower_bound = (double) this.lower_bound;
			this.upper_bound = (double) this.upper_bound;
		}
		else if (value_type == ValueType.DATE)
		{
			this.pixel_interval = Duration.between((OffsetDateTime) this.lower_bound, (OffsetDateTime) this.upper_bound).dividedBy(this.max_pixels_number);
			this.lower_bound = ((OffsetDateTime) this.lower_bound);
			this.upper_bound = ((OffsetDateTime) this.upper_bound);
		}
	}
	
	/**
	 * This method calls {@link calculatePixels} to compute the pixels of an axis.
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return A list of pixels.
	 */
	public void calculateAxisPixels(Graphics2D graphics, Position axis_position)
	{	
		calculatePixelInterval();
		if (axis_position == Position.BOTTOM)
		{
			pixels = calculatePixels(graphics, axis_position, 0.0);
		}
		else if (axis_position == Position.LEFT)
		{
			pixels = calculatePixels(graphics, axis_position, 0.0);
		}
	}
	
	/**
	 * Compute the "pixels" of an axis. That is, all the possible values within the given range.
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @param angle : The angle of the pixels labels.
	 * @return A list of pixels.
	 */
	private ArrayList<Pixel> calculatePixels(Graphics2D graphics, Position axis_position, double angle)
	{
		ArrayList<Pixel> result = new ArrayList<Pixel>();

		graphics.setFont(tick_label_font);
		
		if (value_type == ValueType.DOUBLE)
		{
			double lower_bound = (double) this.lower_bound;
			double pixel_interval = (double) this.pixel_interval;
			for (int i = 0; i < max_pixels_number; i++)
			{
				double current_pixel_value = Math.round(lower_bound + (i * pixel_interval));
				String pixel_label = number_formatter.format(current_pixel_value);
				
				if (i % displayed_step == 0)
				{	
					Pixel pixel = new Pixel(current_pixel_value, pixel_label, true, angle);
					result.add(pixel);
					
				}
				else
				{
					Pixel pixel = new Pixel(current_pixel_value, pixel_label, false, angle);
					result.add(pixel);
				}
			}
		}
		else if (value_type == ValueType.DATE)
		{
			OffsetDateTime lower_bound = (OffsetDateTime) this.lower_bound;
			OffsetDateTime upper_bound = (OffsetDateTime) this.upper_bound;
			Duration pixel_interval = (Duration) this.pixel_interval;
			Duration axis_interval = Duration.between(lower_bound, upper_bound);
			for (int i = 0; i < max_pixels_number; i++)
			{
				OffsetDateTime current_pixel_value = lower_bound.plus(pixel_interval.multipliedBy(i));
				
				String pixel_label = "";
				if (axis_interval.compareTo(Duration.ofSeconds(1)) < 0)
				{
					date_time_formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
				}
				else if (axis_interval.compareTo(Duration.ofMinutes(30)) < 0)
				{
					date_time_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				}
				else if (axis_interval.compareTo(Duration.ofHours(24)) < 0)
				{
					date_time_formatter = DateTimeFormatter.ofPattern("HH:mm");
				}
				else if (axis_interval.compareTo(Duration.ofDays(7)) < 0)
				{
					date_time_formatter = DateTimeFormatter.ofPattern("dd-MMM\nHH:mm");
				}
				else if (axis_interval.compareTo(Duration.ofDays(365)) < 0)
				{
					date_time_formatter = DateTimeFormatter.ofPattern("dd-MMM");
				}
				else
				{
					date_time_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				}
				pixel_label = date_time_formatter.format(current_pixel_value);
				
				if (i % displayed_step == 0)
				{
					Pixel pixel = new Pixel(current_pixel_value, pixel_label, true, angle);
					// To avoid showing two pixels with the same label
					if (result.contains(pixel))
					{
						pixel.setLabelVisible(false);
						result.add(pixel);
					}
					else
					{
						result.add(pixel);
					}
				}
				else
				{
					Pixel pixel = new Pixel(current_pixel_value, pixel_label, false, angle);
					result.add(pixel);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Compute the space occupied by the axis (Axis label + Pixels labels).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return The number of pixels along x or y (Depending on the axis position).
	 */
	public double calculateAxisArea(Graphics2D graphics, Position axis_position)
	{
		double result = 0.0;
		double pixel_label_height = 0.0;
		double pixel_label_width = 0.0;
		graphics.setFont(axis_label_font);
		calculateAxisPixels(graphics, axis_position);
		
		if (axis_position == Position.BOTTOM)
		{
			pixel_label_height = findMaximumPixelLabelHeight(graphics, pixels, true);
			pixel_label_height += 20.0;
		}
		else if (axis_position == Position.LEFT)
		{
			pixel_label_width = findMaximumPixelLabelWidth(graphics, pixels, false);
			pixel_label_width += 20.0;
		}

		Rectangle2D axis_label_enclosure = calculateAxisLabelEnclosure(graphics, axis_position);
		if (axis_position == Position.BOTTOM)
		{
			result = axis_label_enclosure.getHeight() + pixel_label_height;
		}
		else if (axis_position == Position.LEFT)
		{
			result = axis_label_enclosure.getWidth() + pixel_label_width;
		}

		return result;
	}
	
	/**
	 * Compute the space occupied by the axis label.
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return A 2D rectangle that bounds the axis label.
	 */
	private Rectangle2D calculateAxisLabelEnclosure(Graphics2D graphics, Position axis_position)
	{
		FontMetrics metrics = graphics.getFontMetrics(axis_label_font);
		Rectangle2D bounds = new Rectangle2D.Double();
		Rectangle2D result = new Rectangle2D.Double();
		Dimension size = null;
		if (axis_label != null && !axis_label.equals(""))
		{
			size = DrawingHelper.getTextSize(graphics, axis_label_font, axis_label);
			bounds.setRect(0.0, 0.0, size.getWidth(), size.getHeight());
			double angle = 0.0;
			if (axis_position == Position.LEFT)
			{
				angle = angle - Math.PI / 2.0;
			}
			double x = bounds.getCenterX();
			double y = bounds.getCenterY() + metrics.getAscent();
			AffineTransform transformer = AffineTransform.getRotateInstance(angle, x, y);
			Shape label_bounds = transformer.createTransformedShape(bounds);
			result = label_bounds.getBounds2D();
		}
		return result;
	}
	
	/**
	 * Find the pixel label that has the biggest height.
	 * @param pixels : The list of pixels (Along with their labels).
	 * @param vertical : A flag to tell if a label is vertical or horizontal. 
	 * @return The biggest height of a set of pixels labels.
	 */
	private double findMaximumPixelLabelHeight(Graphics2D graphics, ArrayList<Pixel> pixels, boolean vertical)
	{
		graphics.setFont(tick_label_font);
		double max_height = 0.0;
		if (vertical)
		{
			Iterator<Pixel> iterator = pixels.iterator();
			while (iterator.hasNext())
			{
				Pixel pixel = iterator.next();
				Dimension label_size = null;
				if (pixel.getLabel() != null)
				{
					label_size = DrawingHelper.getTextSize(graphics, tick_label_font, pixel.getLabel());
				}
				if (label_size != null && label_size.getWidth() > max_height)
				{
					max_height = label_size.getWidth();
				}
			}
		}
		else
		{
			LineMetrics metrics = tick_label_font.getLineMetrics("BaseLine", graphics.getFontRenderContext());
			max_height = metrics.getHeight();
		}
		return max_height;

	}

	/**
	 * Find the pixel label that has the biggest width.
	 * @param pixels : The list of pixels (Along with their labels).
	 * @param vertical : A flag to tell if a label is vertical or horizontal. 
	 * @return The biggest width of a set of pixels labels.
	 */
	private double findMaximumPixelLabelWidth(Graphics2D graphics, ArrayList<Pixel> pixels, boolean vertical)
	{
		graphics.setFont(tick_label_font);
		double max_width = 0.0;
		if (!vertical)
		{
			Iterator<Pixel> iterator = pixels.iterator();
			while (iterator.hasNext())
			{
				Pixel pixel = iterator.next();
				Dimension label_size = null;
				if (pixel.getLabel() != null)
				{
					label_size = DrawingHelper.getTextSize(graphics, tick_label_font, pixel.getLabel());
				}
				if (label_size != null && label_size.getWidth() > max_width)
				{
					max_width = label_size.getWidth();
				}
			}
		}
		else
		{
			LineMetrics metrics = tick_label_font.getLineMetrics("BaseLine", graphics.getFontRenderContext());
			max_width = metrics.getHeight();
		}
		return max_width;
	}
	
	/**
	 * Compute the coordinates from which the pixel label will be drawn.
	 * @param pixel : The pixel for which the anchor point is computed.
	 * @param cursor : A cursor used to track the current x or y coordinate (For drawing other axis elements).
	 * @param data_area : The 2D rectangle that bounds the data area (Plot area without the axes).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return A set of x and y coordinates stored in an array.
	 */
	private float[] calculatePixelAnchorPoint(Pixel pixel, double cursor, Rectangle2D data_area, Position axis_position)
	{
		float[] result = new float[2];
		if (axis_position == Position.BOTTOM)
		{
			result[0] = (float) valueToCoordinate(pixel.getValue(), data_area, axis_position);
			result[1] = (float) (cursor + 20.0);
		}
		else if (axis_position == Position.LEFT)
		{
			result[0] = (float) (cursor - 20.0);
			result[1] = (float) valueToCoordinate(pixel.getValue(), data_area, axis_position);
		}
		return result;
	}
    
	/**
	 * Convert a value (Of type {@link ValueType#DATE} or {@link ValueType#DOUBLE}) to a coordinate.
	 * @param value : The value to be converted.
	 * @param data_area : The 2D rectangle that bounds the data area (Plot area without the axes).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return The x or y coordinate of a value on an axis (x if the axis is horizontal and y if the axis is vertical).
	 */
	public int valueToCoordinate(Object value, Rectangle2D data_area, Position axis_position)
	{
		int axis_coordinate = 0;
		if (value_type == ValueType.DOUBLE)
		{
			double lower_bound = (double) this.lower_bound;
			double upper_bound = (double) this.upper_bound;

			double min = 0.0;
			double max = 0.0;
			if (axis_position == Position.BOTTOM)
			{
				min = data_area.getX();
				max = data_area.getMaxX();
			}
			else if (axis_position == Position.LEFT)
			{
				max = data_area.getMinY();
				min = data_area.getMaxY();
			}

			axis_coordinate = (int) (min + (((double) value - lower_bound) / (upper_bound - lower_bound)) * (max - min));
		}
		else if (value_type == ValueType.DATE)
		{
			long lower_bound = (long) ((OffsetDateTime) this.lower_bound).toInstant().toEpochMilli();
			long upper_bound = (long) ((OffsetDateTime) this.upper_bound).toInstant().toEpochMilli();

			double min = 0.0;
			double max = 0.0;
			if (axis_position == Position.BOTTOM)
			{
				min = data_area.getX();
				max = data_area.getMaxX();
			}
			else if (axis_position == Position.LEFT)
			{
				max = data_area.getMinY();
				min = data_area.getMaxY();
			}

			axis_coordinate = (int) (min + ((((double) ((OffsetDateTime) value).toInstant().toEpochMilli()) - lower_bound) / (upper_bound - lower_bound)) * (max - min));
		}
		
		return axis_coordinate;
	}
	
	/**
	 * Draw the axis label on a given graphics.
	 * @param label : The label of the axis.
	 * @param cursor : A cursor used to track the current x or y coordinate (For drawing other axis elements).
	 * @param data_area : The 2D rectangle that bounds the data area (Plot area without the axes).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return The updated x or y coordinate of the cursor.
	 */
	private double drawAxisLabel(Graphics2D graphics, String label, double cursor, Rectangle2D data_area, Position axis_position)
	{
		double updated_cursor = 0.0;
		graphics.setFont(axis_label_font);
		graphics.setPaint(axis_label_color);
		Rectangle2D bounds = new Rectangle2D.Double();
		Dimension size = DrawingHelper.getTextSize(graphics, axis_label_font, label);
		bounds.setRect(0.0, 0.0, size.getWidth(), size.getHeight());

		if (axis_position == Position.BOTTOM)
		{
			double x = data_area.getCenterX() - bounds.getWidth();
			double y = cursor + bounds.getHeight() / 2.0;
			DrawingHelper.drawRotatedString(graphics, label, axis_label_font, (float) x, (float) y, 0.0);
			updated_cursor = cursor + bounds.getHeight();			
		}
		else if (axis_position == Position.LEFT)
		{
			double x = cursor - bounds.getWidth() / 2.0;
			double y = data_area.getCenterY() + bounds.getHeight();
			DrawingHelper.drawRotatedString(graphics, label, axis_label_font, (float) x, (float) y, 0.0 - Math.PI / 2.0);
			updated_cursor = cursor - bounds.getWidth();
		}
		
		return updated_cursor;
	}

	/**
	 * Draw the axis line on a given graphics.
	 * @param cursor : A cursor used to track the current x or y coordinate (For drawing other elements).
	 * @param data_area : The 2D rectangle that bounds the data area (Plot area without the axes).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 */
	private void drawAxisLine(Graphics2D graphics, double cursor, Rectangle2D data_area, Position axis_position)
	{
		Line2D axis_line = null;
		double x = data_area.getX();
		double y = data_area.getY();
		if (axis_position == Position.BOTTOM)
		{
			axis_line = new Line2D.Double(x, cursor, data_area.getMaxX(), cursor);
		}
		else if (axis_position == Position.LEFT)
		{
			axis_line = new Line2D.Double(cursor, y, cursor, data_area.getMaxY());
		}
		graphics.setPaint(axis_line_color);
		graphics.setStroke(axis_line_stroke);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
		graphics.draw(axis_line);
	}
    
	/**
	 * Draw the pixels labels, or ticks, on a given graphics.
	 * @param cursor : A cursor used to track the current x or y coordinate (For drawing other elements).
	 * @param data_area : The 2D rectangle that bounds the data area (Plot area without the axes).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return The updated x or y coordinate of the cursor.
	 */
	private double drawPixelsLabels(Graphics2D graphics, double cursor, Rectangle2D data_area, Position axis_position)
	{
		double updated_cursor = 0.0;
		drawAxisLine(graphics, cursor, data_area, axis_position);
		calculateAxisPixels(graphics, axis_position);
		graphics.setFont(tick_label_font);
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
		Iterator<Pixel> iterator = pixels.iterator();
		while (iterator.hasNext())
		{
			Pixel pixel = iterator.next();
			if (pixel.isLabelVisible())
			{
				graphics.setPaint(tick_label_color);
				float[] anchor_point = calculatePixelAnchorPoint(pixel, cursor, data_area, axis_position);
				DrawingHelper.drawRotatedString(graphics, pixel.getLabel(), tick_label_font, anchor_point[0], anchor_point[1], pixel.getLabelRotationAngle());

				float xx = (float) valueToCoordinate(pixel.getValue(), data_area, axis_position);
				Line2D mark = null;
				graphics.setStroke(tick_mark_stroke);
				graphics.setPaint(tick_mark_color);
				if (axis_position == Position.LEFT)
				{
					mark = new Line2D.Double(cursor - 3, xx, cursor + 3, xx);
				}
				else if (axis_position == Position.BOTTOM)
				{
					mark = new Line2D.Double(xx, cursor + 3, xx, cursor - 3);
				}
				graphics.draw(mark);
			}
		}

		double used = 0.0;
		{
			if (axis_position == Position.LEFT)
			{
				used += findMaximumPixelLabelWidth(graphics, pixels, false);
				updated_cursor = cursor - used - 30.0;
			}
			else if (axis_position == Position.BOTTOM)
			{
				used = findMaximumPixelLabelHeight(graphics, pixels, false);
				updated_cursor = cursor + used + 30.0;
			}
		}
		
		return updated_cursor;
	}

	/**
	 * Draw all axis elements on a given graphics.
	 * @param cursor : A cursor used to track the current x or y coordinate (For drawing other elements).
	 * @param data_area : The 2D rectangle that bounds the data area (Plot area without the axes).
	 * @param axis_position : The position of the axis. {@link Position#BOTTOM} means it's a horizontal axis, 
	 * and {@link Position#LEFT} means it's a vertical axis.
	 * @return The updated x or y coordinate of the cursor.
	 */
	public double draw(Graphics2D graphics, double cursor, Rectangle2D data_area, Position axis_position)
	{
		double updated_cursor_1 = drawPixelsLabels(graphics, cursor, data_area, axis_position);
		double updated_cursor_2 = drawAxisLabel(graphics, axis_label, updated_cursor_1, data_area, axis_position);
		
		return updated_cursor_2;
	}

	public String getAxisLabel()
	{
		return axis_label;
	}

	public void setAxisLabel(String axis_label)
	{
		this.axis_label = axis_label;
	}

	public ArrayList<Pixel> getPixels()
	{
		return pixels;
	}

	public void setPixels(ArrayList<Pixel> pixels)
	{
		this.pixels = pixels;
	}

	public Object getLowerBound()
	{
		return lower_bound;
	}

	public void setLowerBound(Object lower_bound)
	{
		this.lower_bound = lower_bound;
	}

	public Object getUpperBound()
	{
		return upper_bound;
	}

	public void setUpperBound(Object upper_bound)
	{
		this.upper_bound = upper_bound;
	}

	public Object getPixelInterval()
	{
		return pixel_interval;
	}

	public void setPixelInterval(Object pixel_interval)
	{
		this.pixel_interval = pixel_interval;
	}

	public ValueType getValueType()
	{
		return value_type;
	}

	public void setValueType(ValueType value_type)
	{
		this.value_type = value_type;
	}

	public int getMaxPixelsNumber()
	{
		return max_pixels_number;
	}

	public void setMaxPixelsNumber(int max_pixels_number)
	{
		this.max_pixels_number = max_pixels_number;
	}

	public int getDisplayedStep()
	{
		return displayed_step;
	}

	public void setDisplayedStep(int displayed_step)
	{
		this.displayed_step = displayed_step;
	}

	public NumberFormat getNumberFormatter()
	{
		return number_formatter;
	}

	public void setNumberFormatter(NumberFormat number_formatter)
	{
		this.number_formatter = number_formatter;
	}

	public DateTimeFormatter getDateTimeFormatter()
	{
		return date_time_formatter;
	}

	public void setDateFormatter(DateTimeFormatter date_time_formatter)
	{
		this.date_time_formatter = date_time_formatter;
	}

	public Font getAxisLabelFont()
	{
		return axis_label_font;
	}

	public void setAxisLabelFont(Font axis_label_font)
	{
		this.axis_label_font = axis_label_font;
	}

	public Font getTickLabelFont()
	{
		return tick_label_font;
	}

	public void setTickLabelFont(Font tick_label_font)
	{
		this.tick_label_font = tick_label_font;
	}

	public Paint getAxisLabelColor()
	{
		return axis_label_color;
	}

	public void setAxisLabelColor(Paint axis_label_color)
	{
		this.axis_label_color = axis_label_color;
	}

	public Paint getAxisLineColor()
	{
		return axis_line_color;
	}

	public void setAxisLineColor(Paint axis_line_color)
	{
		this.axis_line_color = axis_line_color;
	}

	public Paint getTickLabelColor()
	{
		return tick_label_color;
	}

	public void setTickLabelColor(Paint tick_label_color)
	{
		this.tick_label_color = tick_label_color;
	}

	public Paint getTickMarkColor()
	{
		return tick_mark_color;
	}

	public Stroke getAxisLineStroke()
	{
		return axis_line_stroke;
	}

	public void setTickMarkColor(Paint tick_mark_color)
	{
		this.tick_mark_color = tick_mark_color;
	}

	public void setAxisLineStroke(Stroke axis_line_stroke)
	{
		this.axis_line_stroke = axis_line_stroke;
	}

	public Stroke getTickMarkStroke()
	{
		return tick_mark_stroke;
	}

	public void setTickMarkStroke(Stroke tick_mark_stroke)
	{
		this.tick_mark_stroke = tick_mark_stroke;
	}
}
