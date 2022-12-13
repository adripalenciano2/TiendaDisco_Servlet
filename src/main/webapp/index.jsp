<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tienda Discos</title>
    <a id="index"></a>
</head>
<body>
<h1><%= "Tienda Discos" %></h1>
<br/>

<h2>Bienvenido a nuestra tienda. ¿Qué quieres hacer?</h2>
<ul>
    <li><a href="listaautores-servlet">Consultar autores y grupos del catálogo</a></li>
    <li><a href="FormularioAutores.jsp">Consultar discos de un autor/grupo</a></li>
    <li><a href="FormularioCompra.jsp">Comprar un disco</a></li>
    <li><a href="FormularioVenta.jsp">Vender un disco</a></li>
</ul>
<br/>
</body>
</html>