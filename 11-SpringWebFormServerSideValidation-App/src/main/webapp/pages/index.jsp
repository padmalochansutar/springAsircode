<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User Form</h2>
	<form:form action="saveUSer" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>usename:</td>
				<td><form:input path="uName" /><br/>
				<td style="color: red"><form:errors path="uName"></form:errors>
			</tr>
			<tr>
				<td>password:</td>
				<td><form:input path="pwd" />
				<td style="color: red"><form:errors path="pwd"></form:errors>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" />
				<td style="color: red"><form:errors path="email"></form:errors>
			</tr>
			<tr>
				<td>phoneNumber:</td>
				<td><form:input path="phno" />
				<td style="color: red"><form:errors path="phno"></form:errors>
			</tr>
			

		</table>
              <tr>
				<td></td>
				<input type="submit" value="save" />
			</tr>




	</form:form>
</body>
</html>