package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String uname=req.getParameter("uname");
		String pass=req.getParameter("password");
		
		LoginDao dao=new LoginDao();
		
		if(dao.checkDetails(uname, pass)){
			
			HttpSession session=req.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("password", pass);
			
			res.sendRedirect("welcome.jsp");
		}
		else{
			res.sendRedirect("login.jsp");
		}
	}
}
