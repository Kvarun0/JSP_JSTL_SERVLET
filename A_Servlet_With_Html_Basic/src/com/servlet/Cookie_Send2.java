package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie_Send2 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{

		int k=0;
		Cookie cookie[]=req.getCookies();
		
		for(Cookie c: cookie){
			if(c.getName().equals("k")){
				k=Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		
		PrintWriter pw=res.getWriter();
		pw.println("sq is : "+ k);
	}
}
