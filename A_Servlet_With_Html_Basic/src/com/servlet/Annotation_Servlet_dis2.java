package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq_")
public class Annotation_Servlet_dis2 extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int k= (int)req.getAttribute("k");
		
		k=k*k;
		
		PrintWriter pw=res.getWriter();
		pw.println(k);
	}
}
