<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>padma It schhol</title>
</head>
<body>

<form:form action="saveData" modelAttribute="userModel" method="POST">
<h1 style="color: green;">${msg }</h1>
<table>
          <tr>
          <td>User name</td>
          <td><form:input path="name" /></td>
          </tr>
          <tr>
             <td>User emailId</td>
             <td><form:input path="email" /></td>
          </tr>
          <tr>
             <td>User phno</td>
             <td><form:input path="number" /></td>         
          </tr>
           <%-- <tr>
             <td>Product Date</td>
             <td><form:input type="date" path="date" name="date" /></td>         
          </tr> --%>
          <tr>
             <td></td>
             <td><input type="submit" value="save"/></td>  <td><input type="reset" value="reset"/></td>               
          </tr>
     </table>






</form:form>
</body>
</html>