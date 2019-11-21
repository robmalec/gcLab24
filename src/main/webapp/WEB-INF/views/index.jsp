<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>lol steak</title>
   <link rel="stylesheet" type="text/css" href="style.css">
   <mvc:resources mapping="/resources/**" location="/resources/" />
</head>
<body>
	<h1 style="font-family:Impact">Welcome to Grand Circus Coffee!</h1>
	<a class="btn-primary" href="/regForm">Register</a>

	
	<table class="table" style="font-family:Comic Sans MS">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Category</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${productList }"  var="pr" >
			<tr>
				<td>${pr.id }</td>
				<td>${pr.name }</td>
				<td>${pr.description }</td>
				<td>${pr.price }</td>
				<td>${pr.quantity }</td>
				<td><a href="addOne?id=${pr.id }">Add to cart</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<img src="https://drive.google.com/file/d/1T8_7gwsyuNpTw3l5-sPghmEwIXBkX6oL/view?usp=sharing"/>
	<img src="/resources/steak.png"/>

</body>
</html>