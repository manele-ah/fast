package fr.ubo.fast.common.utility;

import javax.ws.rs.core.Response;

public class WebHelper
{
	public static String handleResponse(Response response)
	{
		String result;
		try
		{
			result = response.readEntity(String.class);
		}
		catch (Exception exception)
		{
			result = "Failed to read response entity: " + exception.getMessage();
		}
		
		int status = response.getStatus();
		response.close();

		return String.format("HTTP %d: %s", status, result);
	}
}
