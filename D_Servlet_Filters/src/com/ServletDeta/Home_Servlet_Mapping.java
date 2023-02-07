package com.ServletDeta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addUser")
public class Home_Servlet_Mapping extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int id= Integer.parseInt(req.getParameter("uid"));
		String name=req.getParameter("uname");
		
		PrintWriter pw=res.getWriter();
		pw.println("Welcome !" + name);
	}
}
