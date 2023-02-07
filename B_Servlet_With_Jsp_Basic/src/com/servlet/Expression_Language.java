package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo")
public class Expression_Language extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		String name="Varun";
		
		req.setAttribute("name", name);
		
		RequestDispatcher rd=req.getRequestDispatcher("expression_language.jsp");
		
		rd.forward(req, res);
		
	}
}
