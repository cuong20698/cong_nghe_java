package com.cuong.model.dao;

import javax.servlet.annotation.WebServlet;

import com.cuong.model.bean.UserBean;

public class UserDAO {
	
	public boolean InsertUser(UserBean user)
	{  
		return false; 
	} 
	 
	 public boolean DeleteUser(UserBean user) 
	 {
		 return false; 
	 } 
	 
	 public boolean UpdateUser(UserBean user) 
	 {   
		 return false; 
	 } 
	 
	 public boolean CheckUser(UserBean user) 
	 { 
		 if ("admin".equals(user.getUsername()) && "123".equals(user.getPass())) 
		 {
			 return true;  
		 }
		 return false;  
	 } 
}
