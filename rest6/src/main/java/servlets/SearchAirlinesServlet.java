package servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import airlinesAPIdata.MyPojoAirlines;

import utilities.APIConsumer;
import utilities.AirlinesAPIConsumer;

@WebServlet(urlPatterns = "/search-airlines.do")
public class SearchAirlinesServlet extends HttpServlet 
{


	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException 
	{
		
		request.getRequestDispatcher("/WEB-INF/views/search-airlines.jsp").forward(
				request, response);
	}

	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		HashMap<String, String> url = new HashMap<String, String>();
		url.put("base", "https://api.skypicker.com/airlines");
	
		
		AirlinesAPIConsumer airlinesAPIConsumer = new AirlinesAPIConsumer();
		MyPojoAirlines[] api_airlines = airlinesAPIConsumer.consumeAirlines(url);
		
		
		request.setAttribute("api_airlines",api_airlines);
		request.getRequestDispatcher("/WEB-INF/views/result-airlines.jsp").forward(request, response);

		
	}
	
	
}