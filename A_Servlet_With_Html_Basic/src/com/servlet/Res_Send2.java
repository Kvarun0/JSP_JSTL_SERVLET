package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Res_Send2 extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		
		PrintWriter pw=res.getWriter();
		
		pw.println("Sq is :"+k);
	}
}
