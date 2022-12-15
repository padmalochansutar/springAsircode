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

	<h2>Student Registation form</h2>
	<form:form action="regStudent" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>PhoneNo</td>
				<td><form:input path="phoneNo" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobuttons items="${gender }" path="gender" /></td>
			</tr>
			<td>Course</td>
			<td><form:select path="course">
					<form:options items="${course }" />
				</form:select></td>
			</tr>

			<tr>
				<td>Timings</td>
				<td><form:checkboxes items="${timings }" path="timings" /></td>
			</tr>
		</table>

        <tr>
        <td></td>
       <td> <input type="submit" value="save"/></td>
        </tr>


	</form:form>
	
	
</body>
</html>