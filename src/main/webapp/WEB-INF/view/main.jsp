<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<title>Links</title>
<style>
.body {
	overflow: scroll;
}
</style>
</head>

<body>

	<div class="container">
		<h2>Список всіх лінків</h2>
		<%--<p>The .table-striped class adds zebra-stripes to a table:</p>--%>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>№</th>
					<th>Стаття</th>
					<th>Опис</th>
					<th>Дата додавання</th>
					<th>Оцінка</th>
					<th>Редагувати</th>
					<th>Видилати</th>
				</tr>
			</thead>
			<tbody>

				<%!int count = 0;%>
				<c:forEach var="link" items="${linkList}">
					<tr>
						<td><%=++count%></td>
						<td><a href="${link.url}" target="_blank"> <c:out
									value="${link.name}" />
						</a></td>
						<td><c:out value="${link.description}" /></td>
						<td><c:out value="${link.dateofadd}" /></td>
						<td><c:out value="${link.rating}" /></td>
						<td><a href="../links/${link.id}"> <span
								class="glyphicon glyphicon-pencil"></span>

						</a></td>
						<td><a href="../links/delete/${link.id}"> <span
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

