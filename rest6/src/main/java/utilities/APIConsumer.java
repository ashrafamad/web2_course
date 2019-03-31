package utilities;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import airlinesAPIdata.MyPojoAirlines;


public class APIConsumer {
	
	
	private static OkHttpClient client = new OkHttpClient();

	
	public String getJSON(String url) throws IOException 
	{
		  Request request = new Request.Builder().url(url).build();

			  Response response = client.newCall(request).execute();
			   
			    return response.body().string();
			    
			    
	}
}
