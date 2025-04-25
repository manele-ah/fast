package fr.ubo.fast.common.model;

public class AggregationClause
{
	private final String select_clause;
	private final String[] columns;

	public AggregationClause(String select_clause, String[] columns)
	{
		this.select_clause = select_clause;
		this.columns = columns;
	}

	public String getSelectClause()
	{
		return select_clause;
	}

	public String[] getColumns()
	{
		return columns;
	}
}
