package fr.ubo.fast.viewer.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

import fr.ubo.fast.common.utility.DrawingHelper;
import fr.ubo.fast.viewer.constants.HorizontalAlignment;
import fr.ubo.fast.viewer.constants.NordTheme;
import fr.ubo.fast.viewer.constants.Position;

/**
 * The class {@link Title} describes the title of a chart along with its visualization parameters.
 */
public class Title
{
	/** The title text. */
	private String text;
	/** The position of the title relative to the plot area. Only the top position is supported for now. */
	private Position position;
	/** The horizontal alignement of the title within its bounding box. Only the center alignement is supported for now. */
	private HorizontalAlignment horizontal_alignment;
	/** The size of the box that bounds the title. */
	private Dimension size;
	/** A flag that indicates if the title is visible in the chart or not. */
	private boolean visible;
	
	/** The font used to draw the title. */
	private Font font;
	/** The foreground color of the title. */
	private Paint foreground_color;
	
	/** The default visualization settings. */
    private static final Position DEFAULT_POSITION = Position.TOP;
    private static final HorizontalAlignment DEFAULT_HORIZONTAL_ALIGNMENT = HorizontalAlignment.CENTER;
    private static final Font DEFAULT_FONT = new Font("SansSerif", Font.BOLD, 18);
    private static final Paint DEFAULT_TEXT_FOREGROUND_COLOR = Color.decode(NordTheme.TEXT_FOREGROUND_COLOR.toString());
	
	public Title(String text)
	{
		this(text, Title.DEFAULT_POSITION, Title.DEFAULT_HORIZONTAL_ALIGNMENT, Title.DEFAULT_FONT, Title.DEFAULT_TEXT_FOREGROUND_COLOR);
	}

	public Title(String text, Font font)
	{
		this(text, Title.DEFAULT_POSITION, Title.DEFAULT_HORIZONTAL_ALIGNMENT, font, Title.DEFAULT_TEXT_FOREGROUND_COLOR);
	}
	    
	public Title(String text, Position position, HorizontalAlignment horizontal_alignment, Font font, Paint paint)
	{
		this.visible = true;
		this.text = text;
		this.position = position;
		this.horizontal_alignment = horizontal_alignment;
		this.font = font;
		this.foreground_color = paint;
		this.size = new Dimension(0, 0);
	}
	
	public void draw(Graphics2D graphics, Rectangle2D title_area)
	{
		HorizontalAlignment horizontal_alignment = this.horizontal_alignment;
		FontMetrics metrics = graphics.getFontMetrics(font);
		float x = 0.0f, y = 0.0f;
		
		if (horizontal_alignment == HorizontalAlignment.CENTER)
		{
			x = (float) (title_area.getX() + (title_area.getWidth() - size.getWidth()) / 2.0);
			y = (float) (title_area.getY() + ((title_area.getHeight() - size.getHeight()) / 2.0) + metrics.getAscent());
		}
		
		graphics.setFont(font);
		graphics.setPaint(foreground_color);
		graphics.drawString(text, x, y);
	}
	
	public Dimension getSize()
	{
		return size;
	}
	
	public void setSize(Graphics2D graphics)
	{
		this.size = DrawingHelper.getTextSize(graphics, font, text);
	}

	public Position getPosition()
	{
		return position;
	}

	public void setPosition(Position position)
	{
		this.position = position;
	}

	public HorizontalAlignment getHorizontalAlignment()
	{
		return horizontal_alignment;
	}

	public void setHorizontalAlignment(HorizontalAlignment horizontal_alignment)
	{
		this.horizontal_alignment = horizontal_alignment;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}
	
	public boolean isVisible()
	{
		return visible;
	}

	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}

	public Font getFont()
	{
		return font;
	}

	public void setFont(Font font)
	{
		this.font = font;
	}

	public Paint getForegroundColor()
	{
		return foreground_color;
	}

	public void setForegroundColor(Paint foreground_color)
	{
		this.foreground_color = foreground_color;
	}
}
