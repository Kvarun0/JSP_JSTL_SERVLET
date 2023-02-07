package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddTwoNumber extends HttpServlet{
	
	/**
	 *  This Servlet Is Used Two Add Two elements and print result into browser
	 */


	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{

		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		
		PrintWriter pw=res.getWriter();
		
		pw.println("Result is : "+k);
	}
}
