<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>java server page</title>
<style>
	div{
		width: 300px;
		height:250px;
		margin:100px auto;
		background-color: #218B9E;
		color: white;
		border:1px solid #218B9E;
		border-radius: 20px;
	}
	table{
		margin:auto;
		line-height: 30px;
	}
	h1{
		width:100px;
		margin: auto;
		padding-top: 10px;
	}
	
	table input{
		height:20px;
		border-radius: 5px;
	}
	table button{
		height:30px;
		width:100px;
		border-radius: 10px;
		margin-top: 10px;
		background-color: #FFFFFF;
		color: #218B9E;
		font-weight: bold;
	}
	table button:hover {
		background-color: #7E94E7;
		color: #FFFFFF;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form action="servlet1" method="post">
		<div>
			<h1>LOGIN</h1>
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="user"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="text" name="pass"></td>
				</tr>
				<tr>
					<td></td>
					<td class="checkbox"><input type="checkbox" name="chkluu">Remember password!</input></td>
				</tr>
				<tr>
					<td></td>
					<td><button>Login</button></td>
				</tr>
				<tr>
					<td colspan="2" style="color:red;"><label>${ Thongbao }</label></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>