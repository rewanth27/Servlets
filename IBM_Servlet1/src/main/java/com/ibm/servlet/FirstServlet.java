package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")  //this is optional
@WebServlet("/FirstServlet") //this is important
public class FirstServlet extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter p= response.getWriter();
		p.println("<html>");
		p.println("<body");
		p.println("<h1> Welcome to the Session </h1>");
		p.println("</body>");
		p.println("</html");
	}

}
