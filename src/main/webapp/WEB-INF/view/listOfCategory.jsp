<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Theme List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css"
	href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">
		<h1 style="text-align: center">Категорія</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>№</th>
					<th>Назва</th>
					<th>Редагувати</th>
					<th>Видалити</th>
				</tr>
			</thead>
			<tbody>
				<%!int count = 0;%>
				<c:forEach var="category" items="${categoryList}">
					<tr>
						<td><%=++count%></td>
						<td><c:out value="${category.categoryName}" /></td>
						<td><a href="../links/category/${category.id}"> <span
								class="glyphicon glyphicon-pencil"></span>
						</a></td>
						<td><a href="/links/category/${category.id}"> <span
								class="glyphicon glyphicon-trash"></span>

						</a></td>
					</tr>
				</c:forEach>
				<!-- <%=count = 0%> -->
			</tbody>
		</table>
	</div>
</body>
</html>
