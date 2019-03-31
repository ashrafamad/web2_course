package utilities;

import java.util.HashMap;

import com.google.gson.Gson;

import airlinesAPIdata.MyPojoAirlines;

public class AirlinesAPIConsumer {
	
	APIConsumer c = new APIConsumer();
	
	public MyPojoAirlines[] consumeAirlines(HashMap<String, String> url)
	{
		
		MyPojoAirlines[] api = getandparseAirlines(url);
		return api; 
		
	}
	
	public MyPojoAirlines[] getandparseAirlines(HashMap<String, String> url)
	{
		String json = null; 
		
		
		try 
		{
			json = c.getJSON(url.get("base"));
			System.out.println(json);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		MyPojoAirlines[] api = gson.fromJson(json, MyPojoAirlines[].class);
		
		return api;		
	
		
	}
	

}
