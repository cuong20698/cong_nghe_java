package Dangnhap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Welcome extends HttpServlet{
	@Override
	public void init() throws ServletException {
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		String user = (String)session.getAttribute("username");
		out.print("Welcome! "+user);
	}
	
	@Override
	public void destroy() {
	}
}
