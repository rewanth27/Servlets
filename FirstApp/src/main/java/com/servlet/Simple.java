package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Simple
 */

public class Simple extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
       response.setContentType("text/html");
       PrintWriter p=response.getWriter();
       
       String u=request.getParameter("UserName");
       String pa=request.getParameter("UserPassword");
       if(u.equals("vara") && pa.equals("abc"))
       {
    	   RequestDispatcher rd=request.getRequestDispatcher("welcome");
    	   rd.forward(request, response);
       }
       else
       {
    	   p.print("Sorry username or password error!");
    	   RequestDispatcher rd=request.getRequestDispatcher("login.html");
    	   rd.include(request, response);
       }
	}

}
