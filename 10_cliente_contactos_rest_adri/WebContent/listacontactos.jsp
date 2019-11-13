<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
<h1>Lista de contactos</h1>
	<table class="table table-striped table-bordered">
		<thead><tr><th>Nombre</th><th>Email</th><th>Edad</th></tr></thead>
		<tbody>
		
		<c:forEach var="l" items="${requestScope.listaContactos}" >
			<tr>
				<td>${l.nombre}</td>
				<td>${l.email}</td>
				<td>${l.edad}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<br/><br/>
	<a href="toEntrada">Volver</a>
</div>
</body>
</html>