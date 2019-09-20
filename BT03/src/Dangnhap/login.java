package Dangnhap;

import java.io.*;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.*;
import javax.servlet.http.*;;

public class login extends HttpServlet{

	public login() {}
	@Override
	public void init() throws ServletException {
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		if(user == "admin" && pass == "123")
		{
			RequestDispatcher rd = req.getRequestDispatcher("servlet2");
			rd.forward(req, resp);
		}
		else {
			String tb = "Sorry UserName or Password error";
			req.setAttribute("thongbao", tb);
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}
	
	@Override
	public void destroy() {
	}
}
