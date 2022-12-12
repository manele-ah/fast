package fr.ubo.fast.common.utility;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class DrawingHelper
{
	public static Dimension getTextSize(Graphics2D graphics, Font font, String text)
	{
		FontMetrics metrics = graphics.getFontMetrics(font);
		int height = metrics.getHeight();
		int advance = metrics.stringWidth(text);
		
		return new Dimension(advance, height);
	}

	public static void drawRotatedString(Graphics2D graphics, String text, Font font, float x, float y, double angle)
	{
		if (angle == 0.0)
		{
			// graphics.drawString(text, x, y);
			for (String line : text.split("\n"))
			{
				graphics.drawString(line, x, y);
				y += graphics.getFontMetrics().getHeight();
			}
		}
		else
		{
			AffineTransform previous_transform = graphics.getTransform();
			Dimension size = DrawingHelper.getTextSize(graphics, font, text);
			float rotate_x = (float) ((size.getWidth() / 2.0) + x);
			float rotate_y = (float) ((size.getHeight() / 2.0) + y);
			AffineTransform rotate = AffineTransform.getRotateInstance(angle, rotate_x, rotate_y);
			graphics.transform(rotate);
			graphics.drawString(text, rotate_x, rotate_y);
			graphics.setTransform(previous_transform);
		}
	}
}
