package com.httpsession;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FirstServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  response.setContentType("text/html");
	  PrintWriter pou=response.getWriter();
	  
	  String u=request.getParameter("userName");
	  
	  HttpSession session=request.getSession();
	  session.setAttribute("uname", u);
	  pou.print("<a href='servlet2'> visit</a>");
	  pou.close();
	}

}
