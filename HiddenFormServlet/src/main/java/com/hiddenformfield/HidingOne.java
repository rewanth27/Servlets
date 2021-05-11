package com.hiddenformfield;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HidingOne extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("uname");
		
		
		//creating the form that is invisible textfield
		out.print("<form action='welcome'>");
		out.print("<input type='hidden' name='uname' value='"+n+"' >");
		
		out.print("<input type='submit' value='go'");
		out.print("</form>");
		out.close();
	}

}
