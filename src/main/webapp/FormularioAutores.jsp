<%--
  Created by IntelliJ IDEA.
  User: Adri
  Date: 13/12/2022
  Time: 17:42
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

<h2>Introduce un autor o grupo</h2>

<form action="listadiscos-servlet" method="post" name="autor_form">
    <label for="name">Nombre del autor/grupo:</label>
    <input type="text" id="name" name="author_name">
    <button type="submit">Buscar</button>

</form>
<br/>
<a href="index.jsp">Volver al menú principal</a>
</body>
</html>
