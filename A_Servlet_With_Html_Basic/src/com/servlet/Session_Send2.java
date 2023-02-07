package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session_Send2 extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		HttpSession session=req.getSession();
		
		int k=(int)session.getAttribute("k");
		
		k=k*k;
		
		PrintWriter pw=res.getWriter();
		pw.println("Sq is : "+k);
		
	}
}
