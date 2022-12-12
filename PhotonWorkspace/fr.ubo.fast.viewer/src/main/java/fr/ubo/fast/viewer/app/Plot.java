package fr.ubo.fast.viewer.app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;

import fr.ubo.fast.viewer.constants.NordTheme;

/**
 * A {@link Plot} is an abstract class that describes the area in which the axes are drawn and the data is plotted.
 */
public abstract class Plot
{
	/** The chart assigned to the plot. */
	protected Chart chart;
	
	/** The color and stroke settings. */
    protected Paint outline_color;
    protected Paint background_color;
    protected Stroke outline_stroke;
    
    /** The default color and stroke settings. */
    protected static final Paint DEFAULT_OUTLINE_COLOR = Color.decode(NordTheme.PLOT_BACKGROUND_COLOR.toString());
    protected static final Paint DEFAULT_BACKGROUND_COLOR = Color.decode(NordTheme.PLOT_BACKGROUND_COLOR.toString());
    protected static final Stroke DEFAULT_OUTLINE_STROKE = new BasicStroke(0.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
    
	protected Plot()
	{
		this.outline_color = DEFAULT_OUTLINE_COLOR;
		this.background_color = DEFAULT_BACKGROUND_COLOR;
		this.outline_stroke = DEFAULT_OUTLINE_STROKE;
	}
	
	public abstract void draw(Graphics2D graphics, Rectangle2D plot_area);

	protected void fillBackground(Graphics2D graphics, Rectangle2D data_area)
	{
		Paint color = this.background_color;
		graphics.setPaint(color);
		graphics.fill(data_area);
	}

	protected void drawOutline(Graphics2D graphics, Rectangle2D plot_area)
	{
		if (outline_stroke != null)
		{
			graphics.setStroke(outline_stroke);

		}
		graphics.setPaint(outline_color);
		Object rendering_hint = graphics.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
		graphics.draw(plot_area);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, rendering_hint);
	}

	public Chart getChart()
	{
		return chart;
	}

	public void setChart(Chart chart)
	{
		this.chart = chart;
	}

	public Paint getOutlineColor()
	{
		return outline_color;
	}

	public void setOutlineColor(Paint outline_color)
	{
		this.outline_color = outline_color;
	}

	public Paint getBackgroundColor()
	{
		return background_color;
	}

	public void setBackgroundColor(Paint background_color)
	{
		this.background_color = background_color;
	}

	public Stroke getOutlineStroke()
	{
		return outline_stroke;
	}

	public void setOutlineStroke(Stroke outline_stroke)
	{
		this.outline_stroke = outline_stroke;
	}
}
