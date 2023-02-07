package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Why_Jsp extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		
		PrintWriter pw=res.getWriter();
		
		//Designing Output
		
		pw.println("<html><body bgcolor='red'>");
		pw.println("Number is : "+i);
		
		pw.println("</body></html>");
	}
}
