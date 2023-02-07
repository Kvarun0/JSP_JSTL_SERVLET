package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Request_dis1 extends HttpServlet{
	
	/**
	 * For Adding Two Element and Transfer Result to different servlet 
	 * @throws ServletException 
	 */
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}
}
