<%@page import="com.emergentes.practica_n2.registraEncuesta"%>
<% registraEncuesta regencuesta =(registraEncuesta) request.getAttribute("regEncuesta");
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
    <center><h1>Resultados de Encuesta</h1></center>
    <p>Nombre: <%= regencuesta.getNombre() %></p>
    <p>Sistemas Operativos:</p>
    <ul>
    <% for (String sistemaOperativo : regencuesta.getSistemasOperativos()) { %>
        <li><%= sistemaOperativo %></li>
    <% } %>
    </ul>
    <a href="encuesta.jsp">->Volver al Formulario</a> <br>  
    <a href="index.jsp">->Volver a inicio</a>
    </body>
</html>
