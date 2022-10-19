package com.servletForm;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String terms = req.getParameter("condition");
		if(terms!=null) {
			if(terms.equals("checked")) {
				out.println("<h2>Name  : "+name+"</h2>");
				out.println("<h2>Password  : "+pass+"</h2>");
				out.println("<h2>Email  : "+email+"</h2>");
				out.println("<h2>Gender  : "+gender+"</h2>");
				out.println("<h2>Course  : "+course+"</h2>");
			}else {
			}
		}
			else {
				out.println("<h2>Please accept terms and conditions</h2>");
			}
	}
	
	
}
