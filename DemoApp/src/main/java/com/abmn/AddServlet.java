package com.abmn;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("result is " + k);
		//System.out.println("Sum of two number is: "+ k);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("result is " + k);
		//System.out.println("Sum of two number is: "+ k);
	}

}
