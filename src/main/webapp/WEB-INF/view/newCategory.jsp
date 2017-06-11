<%@ page language="java" contentType="text/html; 	charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" 	prefix="cf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>New Theme</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
    rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css"
    href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <h2 style="text-align:center"> Створити категорію</h2>
    <div class="container">

    <cf:form method="POST" action="../addCategory" modelAttribute="category">

        <cf:hidden path="id" />

        <table class="table table-hover">
        <tbody>
        <tr>
        <td><cf:label path="categoryName">
        Name
    </cf:label></td>
        <td><cf:input path="categoryName" /> </br> <cf:errors path="categoryName"
                                                      cssClass="error" /></td>
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