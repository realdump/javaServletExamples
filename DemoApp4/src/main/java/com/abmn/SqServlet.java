package com.abmn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int k = (int) req.getAttribute("k");
		
		k = k * k;
		PrintWriter out1 = res.getWriter();
		out1.println("Result is " +k);
		
		System.out.println("sq called");
	}
}