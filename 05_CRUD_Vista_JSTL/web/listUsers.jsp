<%-- 
    Document   : listUsers
    Created on : 01-oct-2019, 16:47:47
    Author     : alumno
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sinensia.modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usersList" 
             type="java.util.ArrayList<User>" scope="request">
    <jsp:getProperty property="*" name="usersList"></jsp:getProperty>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users list</title>
    </head>
    <body>
        <h1>Users list</h1>
        <%-- ${} corresponde a EL (Expression Language) de JSTL --%>
            <c:forEach items="${usersList}" var="user">
				<form action="users.do" method="post">
					<table>
						<tr>
							<td><input id="id" name="id" 
									   readonly type="number" size="4" 
									   value="${user.id}"/></td>
							<td>${user.email}</td>
							<td>${user.password}</td>
							<td>${user.name}</td>
							<td>${user.age}</td>
							<td><input name="method" type="submit" value="Delete"/></td>
							<td><input name="method" type="submit" value="Modify"/></td>
						</tr>
					</table>
				</form>        
            </c:forEach>
    </body>
</html>
