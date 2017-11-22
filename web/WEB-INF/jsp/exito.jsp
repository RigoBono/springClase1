<%-- 
    Document   : exito
    Created on : 06-jun-2016, 16:44:18
    Author     : heltonsmith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Todo OK!</h1>
        
        <p>Id: ${requestScope.auto.id}</p>
        <p>Marca: ${requestScope.auto.marca}</p>
        <p>Color: ${requestScope.auto.color}</p>
    </body>
</html>
