package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/annotation_ser")
public class Annotation_Servlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		
		PrintWriter pw=res.getWriter();
		
		pw.println("Num Is : "+ i);
	}
}
