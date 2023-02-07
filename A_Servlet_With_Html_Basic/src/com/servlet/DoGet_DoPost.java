/**
 * Used For Mapping Get And Post Method Differently
 */

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DoGet_DoPost extends HttpServlet{

	/**
	 * 
	 */
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter pw=res.getWriter();
		
		pw.println("OutPut of DOGET : "+ i +" + " +j+" = "+k);
		
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter pw=res.getWriter();
		
		pw.println("OutPut of DOPOST : "+ i +" + " +j+" = "+k);
		
	}
	
	
}
