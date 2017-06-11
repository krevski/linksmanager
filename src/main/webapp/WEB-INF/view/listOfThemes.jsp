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
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container">
		<h1 style="text-align: center">Теми</h1>
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
				<c:forEach var="theme" items="${themeList}">
					<tr>
						<td><%=++count%></td>
						<td><c:out value="${theme.themeName}" /></td>
						<td><a href="../links/theme/${theme.id}"> <span
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
