<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- spring Mvc FORMTAG library -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Data binding In Form</h1>
     <h3>Product Form</h3>
     <form:form action="saveProduct" modelAttribute="product" method="POST">
     <table>
          <tr>
          <td>Product Id</td>
          <td><form:input path="productId" /></td>
          </tr>
          <tr>
             <td>Product Name</td>
             <td><form:input path="productName" /></td>
          </tr>
          <tr>
             <td>Product price</td>
             <td><form:input path="price" /></td>         
          </tr>
           <%-- <tr>
             <td>Product Date</td>
             <td><form:input type="date" path="date" name="date" /></td>         
          </tr> --%>
          <tr>
             <td></td>
             <td><input type="submit" value="save"/></td>         
          </tr>
     </table>
     
     </form:form>
</body>
</html>