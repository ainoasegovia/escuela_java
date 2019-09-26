<%-- 
    Document   : head
    Created on : 26-sep-2019, 11:37:46
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%! // <%! Es una etiqueta propia de JSP para crear funciones
	String head(String titulo){
		String nombreJSP = this.getClass().getSimpleName().replaceAll("_", ".");
		return "<head>"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
				+ "<title>03_WebServlets " + titulo + "(" + nombreJSP + ") </title>"
				+ "<link rel='stylesheet' href='./estilos/estilos.jsp'/>"
				+ "</head>";
	}

%>