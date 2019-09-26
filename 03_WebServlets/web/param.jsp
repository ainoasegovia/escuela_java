<%@include file="head.jsp"%>

<!DOCTYPE html>

<%-- Pagina de inicio usando funciones e includes --%>

<html>
	<%= head("Parametros") %>
    <body>
		<%@include file="header.jsp" %>
        <h1>Datos</h1>
        <p>Te llamas <%  out.println(request.getParameter("nombre")); %> </p>
        <p>Y tienes <% out.println( request.getParameter("edad")); %> </p>
        
        <ul>
        <%  for (int i = 0; i < 10; i++) { %>
        
            <li class="tipo-letra-tam-<%= i %>">Numero  <% out.println( "" + i ); %>  </li>
            
        <% } %>
        </ul>
    </body>
</html>
