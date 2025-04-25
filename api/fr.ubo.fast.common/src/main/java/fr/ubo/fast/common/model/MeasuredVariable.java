package fr.ubo.fast.common.model;

public class MeasuredVariable
{
	private int id;
	private String name;
	private String unit;
	
	public MeasuredVariable()
	{
		
	}
	
	public MeasuredVariable(int id, String name, String unit)
	{
		this.id = id;
		this.name = name;
		this.unit = unit;
	}
	
	public MeasuredVariable(String name, String unit)
	{
		this.id = -1;
		this.name = name;
		this.unit = unit;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
	
	public String getUnit()
	{
		return unit;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}	
}
