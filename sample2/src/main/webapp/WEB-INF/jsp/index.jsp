<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>

	<h1>Products</h1>
	
	<c:if test = "${PRODUCT_LIST.size() gt 0}">
	
	<table border=1  width="100%">
	
	
	<thead> 
		<tr>
			<th>Id</th>
			<th>Brand</th>
			<th>Name</th>
			<th>Made In</th>
			
			<th>Price</th>
		</tr>
	
	</thead>
		<tbody>
		
			  <c:forEach var="eachProduct" items="${PRODUCT_LIST}">
		       <tr>
		       
			       	<td>${eachProduct.id}</td>
			       	<td>${eachProduct.brand}</td>
			       	<td>${eachProduct.name}</td>
			       	<td>${eachProduct.madein}</td>
			       	<td>${eachProduct.price}</td>
		       </tr>
		      </c:forEach>
			
		
		</tbody>
	
	
	</table>
	</c:if>
	
	<c:if test = "${PRODUCT_LIST.size() eq 0}">
		<h3>Products Not Available</h3>
	</c:if>
</body>
</html>