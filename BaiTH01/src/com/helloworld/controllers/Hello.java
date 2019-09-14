package com.helloworld.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import javax.xml.ws.Response;

@WebServlet("/index.jsp")
public class Hello extends HttpServlet{
	public void init() throws ServletException{
		// TODO Auto-generated method stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Hello world</h1>");
		out.close();
	}
	
	public void destroy() {
		
	}
}
