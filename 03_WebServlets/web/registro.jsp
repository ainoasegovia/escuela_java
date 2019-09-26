<!DOCTYPE html>
<%--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="./estilos/estilos.jsp"/>
    </head>
    <body>
		<%@include file="header.jsp" %>
		<br/>
        <form name='form1' method='post' action='./param.jsp'>            
            <table border='1'>
                <tr><td>Nombre:</td>  
                    <td><input type='text' name='nombre' id='nombre'/></td></tr>
                <tr><td>Edad:</td>  
                    <td><input type='number' name='edad' id='edad'/></td></tr>
            </table>
			<br/>
            <input type='submit' value='Enviar'/>             
        </form>

    </body>
</html>
