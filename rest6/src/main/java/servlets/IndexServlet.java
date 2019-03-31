package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.squareup.okhttp.OkHttpClient;


import utilities.APIConsumer;


@WebServlet(urlPatterns = "/index.do")
public class IndexServlet extends HttpServlet 
{


	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException 
	{
		
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(
				request, response);
	}

		
}