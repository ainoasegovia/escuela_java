<%-- 
    Document   : estilos
    Created on : 26-sep-2019, 9:30:24
    Author     : alumno
--%>

<%@page contentType="text/css" pageEncoding="UTF-8"%>

.menu-princip{
	display: inline-block;
	border: 2px dashed green;
	margin: 3px;
	padding: 4px;
}

<% for( int i = 0; i < 10; i++)
	{ %>
		.tipo-letra-<%="tam-" + i%>{
			font-size: <%=10 + i * 2 %>px;
			background-color: #4444<%=i * 10 %>;
		}

<%	} %>