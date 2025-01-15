package com.abmn;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		//k = k*k;
		
		res.sendRedirect("sqr");
		
		// Session Management
		
		//req.setAttribute("k", k);
		// to call servlet req dispatcher and Redirect
		
		/*
		 * RequestDispatcher rd = req.getRequestDispatcher("sqr"); rd.forward(req, res);
		 */
	}
	

}