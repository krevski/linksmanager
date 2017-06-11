<%@ page language="java" contentType="text/html; 	charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="cf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
       Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Link</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
        rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css"
        href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%--<link href="<c:url value="/resources/css/table.css" />" rel="stylesheet"
	type="text/css"> --%>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>

</head>
<body>

	<h1 style="text-align:center">
		Додати лінк
	</h1>
	<div class="container">
	<cf:form method="POST" action="addLink" modelAttribute="link">

		<cf:hidden path="id" />

		<table class="table table-hover">
		<tbody>
				<tr>
				<td><cf:label path="name">
        		Name
    			</cf:label></td>
				<td><cf:input path="name" /> </br> <cf:errors path="name"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td><cf:label path="url">
						URL
					</cf:label></td>
				<td><cf:input path="url" /> </br> <cf:errors path="url"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td><cf:label path="description">  Description

                      </cf:label></td>
				<td><cf:input path="description" /> </br> <cf:errors
						path="description" cssClass="error" /></td>
			</tr>
			<tr>
				<td><cf:label path="rating">  Rating

    </cf:label></td>
				<td><cf:input path="rating" /> </br> <cf:errors path="rating"
						cssClass="error" /></td>
			</tr>

			<tr>
				<td><cf:label path="category.id"> Категорія</cf:label></td>
				

				<td><cf:select path="category.id" items="${allCategory}"
						itemValue="id" itemLabel="categoryName" required="true" /> 
			</tr>
			<tr>
				<td><cf:label path="theme.id">Тема</cf:label></td>
			

				<td><cf:select path="theme.id" items="${allTheme}"
						itemValue="id" itemLabel="themeName" required="true" /> 
			</tr>

			

			<tr>
				<td colspan="2" align="center"><input type="submit" value="OK" />
				</td>
			</tr>
		</tbody>
		</table>

	</cf:form>
	</div>
</body>
</html>
