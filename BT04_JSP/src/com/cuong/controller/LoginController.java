package com.cuong.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.cuong.model.bean.UserBean;
import com.cuong.model.dao.UserDAO;

@WebServlet("/a")
public class LoginController extends HttpServlet{
	public LoginController()
	{       
		super(); 
	} 
	 
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			   throws ServletException, IOException
	   {    
		   String username = request.getParameter("username"); 
		   String password = request.getParameter("pass");  
		   UserBean user = new UserBean();
		   user.setUsername(username); 
		   user.setPass(password);    
		   UserDAO userDAO = new UserDAO();  
		   boolean result = userDAO.CheckUser(user); 
		   if(result)
		   {   
			   RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");    
			   HttpSession session=request.getSession();  
			   session.setAttribute("user", user);       
			   rd.forward(request,  response);  
		   }  
		   else {     
			   RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp"); 
			   
		   rd.forward(request, response);
		   } 
	   
	   }
}
