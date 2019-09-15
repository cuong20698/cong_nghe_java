import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginChecker extends HttpServlet{

	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		
		if(username.equals("admin") && password.equals("123")) {
			out.println("Xin chào: "+ username);
		}else {
			out.println("Vui lòng đăng nhập lại");
		}
		out.close();
	}
	
	@Override
	public void destroy() {
		
	}
}
