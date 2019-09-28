<%@ page  contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>java server page</title>
<style type="text/css">
	.main{
		width:400px;
		height:200px;
		margin:40px auto;
		background-color: #3E42EE;
		border-radius: 30px;
		text-align: center;
	}
	input{
		height: 30px;
		width: 200px;
		border-radius: 5px;
		padding: 5px;
		margin-top: 20px;
		border:none;
	}
	.center{
		width:300px;
		margin: auto;	
	}
	
	button{
		height: 30px;
		width: 100px;
		border-radius: 5px;
		padding: 5px;
		margin-top: 20px;
		border: none;
	}
	
	button:hover {
		background-color: #0DFB00;
		font-weight: bold;
		color: #000000;
	}
</style>
</head>
<body>
	<div class="main">
	<form action="process.jsp">
		<div class="center">
			<input type="text" name="username" placeholder="Username"><br>
			<input type="password" name="pass" placeholder="Password"><br>
		</div>
		
		<button>Login</button><br>
	</form>
	</div>
</body>
</html>