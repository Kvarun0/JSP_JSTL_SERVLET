package com.ServletDeta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addUser")
public class IdFilter implements Filter {

   
	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req= (HttpServletRequest) request;
		
		int id=Integer.parseInt(req.getParameter("uid"));
		
		PrintWriter pw=response.getWriter();
		
	
		
		if(id > 1){
			chain.doFilter(request, response);
		}
		else{
			pw.println("Invalid User Id ");
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
