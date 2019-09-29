<%@ page import="com.cuong.model.bean.UserBean" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>java server page</title>
</head>
<body>
	<p>You are successfully logged in!</p> 
	<%   
		UserBean bean = (UserBean) session.getAttribute("user");
		out.print("Welcome, " + bean.getUsername()); 
	%>
</body>
</html>