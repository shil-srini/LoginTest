<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Login Test</title>
</head>
<body>
<form:form  name="submitForm" method="POST">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
			<tr>
			
			
			</tr>
		</table>
		<div style="color:red">${error}
			</div>
	</form:form>

</body>
</html>