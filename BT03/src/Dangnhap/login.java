package Dangnhap;

import java.io.*;
import java.net.HttpCookie;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.websocket.Session;;

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
		boolean check = Boolean.parseBoolean(req.getParameter("chkluu"));
		HttpSession session = req.getSession();
		
		if(user.equals("admin") && pass.equals("123")){
			session.setAttribute("username", user);
			RequestDispatcher rd = req.getRequestDispatcher("servlet2");
			rd.forward(req, resp);
		}
		else {
			String tb = req.getParameter("lblThongbao");
			tb = "Sorry UserName or Password error";
			req.setAttribute("Thongbao", tb);
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
	}
	
	@Override
	public void destroy() {
	}
}
