package com.revature.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class revatureP1Servlet extends HttpServlet {

//	The HttpServletRequest is an object representation of sn HTTP request. HTTP head and body access
/*
	The HttpServletResponse is an object representation of an HTTP response. Allows you to populate the "status code"
	(the response head and body).
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

//		This is how you write to the response body in two ways:
//		PrintWriter write = response.getWriter();
//		write.write("Welcome Employee");
		response.getWriter().write("Welcome Employee");
	}


}
