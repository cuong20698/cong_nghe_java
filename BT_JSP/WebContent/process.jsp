<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>java server page</title>
</head>
<body>
	<%-- <% 
		String ten = request.getParameter("username");
		String matkhau = request.getParameter("pass");
		
		out.println("Tên đăng nhập: "+ten+"</br>");
		out.print("Mật khẩu: "+matkhau);
	%> --%>
	
	<jsp:useBean id="u" class="com.cuong.demojsp.UserBean"></jsp:useBean>
	<jsp:setProperty property="username" name="u"/>
	<jsp:setProperty property="pass" name="u"/>
	
	You entered:</br>
	Username: <jsp:getProperty property="username" name="u"/><br>
	Password: <jsp:getProperty property="pass" name="u"/>
</body>
</html>