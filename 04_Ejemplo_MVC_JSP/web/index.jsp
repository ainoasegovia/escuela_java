<!DOCTYPE html>

<html>
	<head>
		<title>Ejemplo MVC con JSP y Servlet</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body>
		<h1>Ejemplo MVC con JSP y Servlet</h1>
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
