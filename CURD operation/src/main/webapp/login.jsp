<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="EmpController" method="get">
		<table>
			
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			
				<!-- <tr>
				<td><input type="submit" name="action" value="register"></td>
				</tr> -->
				
		     <tr>
				<td><a href="EmpController?action=login">Login</a> </td>
			</tr>
		</table>
	</form>


</body>
</html>