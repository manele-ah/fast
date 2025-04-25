package fr.ubo.fast.client.api;

import fr.ubo.fast.client.api.TimeSeriesDataSupplierClient;

public class PreFetchManager
{
	private final TimeSeriesDataSupplierClient client;
	private final int buffer_size;
	// Add buffers for each time series/aggregation combination
	// To do

	public PreFetchManager(String endpoint_path, int buffer_size)
	{
		this.client = new TimeSeriesDataSupplierClient(endpoint_path);
		this.buffer_size = buffer_size;
		// To do
	}

	public void init(String key)
	{
		// To do
	}

	public void previous(String key)
	{
		// To do
	}

	public void next(String key)
	{
		// To do
	}

	public void down(String key)
	{
		// To do
	}

	public void up(String key)
	{
		// To do
	}
}
