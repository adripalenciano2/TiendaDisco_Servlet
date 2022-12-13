<%--
  Created by IntelliJ IDEA.
  User: Adri
  Date: 13/12/2022
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Tienda Discos</title>
</head>
<body>
<h1>Tienda Discos</h1>

<h2>Introduce el código de un disco</h2>

<form action="compradisco-servlet" method="post" name="compra_form">
  <label for="code1">Código del disco:</label>
  <input type="text" id="code1" name="cd_code">
  <br/>
  <button type="submit">Comprar</button>

</form>
<br/>
<a href="index.jsp">Volver al menú principal</a>
</body>
</html>
