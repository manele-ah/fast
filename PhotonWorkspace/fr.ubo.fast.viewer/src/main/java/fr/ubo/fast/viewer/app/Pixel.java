package fr.ubo.fast.viewer.app;

/**
 * A {@link Pixel} describes a value displayed on an axis.
 */
public class Pixel
{
	/** The value linked to a pixel (Only doubles and timestamps are supported for now). */
	private Object value;
	/** The label linked to a pixel value (For drawing the ticks on an axis). */
	private String label;
	/** A flag to indicate if the pixel label is visible or not. */
	private boolean label_visible;
	/** The rotation angle of the pixel label. */
	private double label_rotation_angle;
	
	public Pixel(Object value, String label, boolean label_visible, double label_rotation_angle)
	{
		this.value = value;
		this.label = label;
		this.label_visible = label_visible;
		this.label_rotation_angle = label_rotation_angle;
	}
	
	/**
	 * Two pixels are equal if they have the same label and if they share the same visible flag.
	 * This method is needed when drawing the pixels labels on an axis (To avoid having the same label many times).
	 */
	@Override
	public boolean equals(Object object)
	{
		if ((object == null) || (object.getClass() != this.getClass()))
		{
			return false;
		}

		Pixel pixel = (Pixel) object;
		return (this.label_visible == pixel.label_visible) && (this.label.equals(pixel.label));
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
		result = prime * result + (this.label_visible ? 1 : 0);
		return result;
	}

	public Object getValue()
	{
		return value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public boolean isLabelVisible()
	{
		return label_visible;
	}

	public void setLabelVisible(boolean label_visible)
	{
		this.label_visible = label_visible;
	}

	public double getLabelRotationAngle()
	{
		return label_rotation_angle;
	}

	public void setLabelRotationAngle(double label_rotation_angle)
	{
		this.label_rotation_angle = label_rotation_angle;
	}
}
