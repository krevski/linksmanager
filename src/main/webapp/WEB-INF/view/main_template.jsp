<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Links Collector</title>
	<style>
    	 body{ margin-top:20px; margin-bottom:20px; height:100%; width:100%; background-color:#DFDFDF;}
	</style>
</head>
<body>
   
     <!-- <tiles:insertAttribute name="header" />  -->   
       
        <tiles:insertAttribute name="menu" /> 
            
        <tiles:insertAttribute name="body" />

        <tiles:insertAttribute name="footer" /> 
       
</body>
</html>
