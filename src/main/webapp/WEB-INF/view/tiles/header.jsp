<%@ page language="java" contentType="text/html; 	charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<style>
   table {
    width: 600px;
    
    margin: auto; 
   }
   td {
    text-align: center;
   }
   h1 {text-align:  center;
      color: #9595b6;}
  </style>

  <table>
	<tr>
		<td align="right"><a href="http://localhost:8080/Links/links/main.html"> <img src="<c:url value="/resources/images/links.jpg" />"
			width="250" height="125" style="padding-top: 10px;" />  </a>
		<td align="left"><h1><spring:message code="header.name"/></h1>
	</tr>
</table>
			
		
	
