package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoForJstlCore")
public class Servlet_for_jstl_core extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String name="varun";
		
		req.setAttribute("name", name);
		RequestDispatcher rd=req.getRequestDispatcher("jsp_with_jstl_core_tag.jsp");
		rd.forward(req, res);
	}
	
}
