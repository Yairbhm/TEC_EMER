<%@page import="com.emergentes.practica_n2.registraLibro"%>
<% registraLibro reglibro =(registraLibro) request.getAttribute("regLibro");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        body {
            font-family: Century Gothic;
            line-height: 1.5;
        }
    </style>
    </head>
    <body>
    <center><h1>Se registro el Libro correctamente</h1></center>
    <b>Los datos del libro registrado son:</b>
    <p>Nombre: <%= reglibro.getNombre() %></p>
    <p>Autor: <%= reglibro.getAutor()%></p>
    <p>Resumen: <%= reglibro.getResumen()%></p>
    <p>Tipo de Libro:</p>
    <ul>
    <% for (String tipo : reglibro.getTipo()) { %>
        <li><%= tipo %></li>
    <% } %>
    </ul>
    <a href="libro.jsp">->Volver al Formulario</a> <br>  
    <a href="index.jsp">->Volver a inicio</a>
    </body>
</html>

