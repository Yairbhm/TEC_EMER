
<%@page import="com.emergentes.practica_n2.registraInscripcion"%>
<% registraInscripcion reginscripcion =(registraInscripcion) request.getAttribute("regInscripcion");
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
    <center><h1>Resultados de Inscripcion</h1></center>
    <b>Datos Personales:</b>
    <p>Fecha: <%= reginscripcion.getFecha() %></p>
    <p>Nombre: <%= reginscripcion.getNombre() %></p>
    <p>Apellido: <%= reginscripcion.getApellido() %></p>
    <p>Turno: <%= reginscripcion.getTurno() %></p>
     <b>Seminarios Inscritos</b>
    <ul>
    <% for (String seminarios : reginscripcion.getSeminarios()) { %>
        <li><%= seminarios %></li>
    <% } %>
    </ul>
    
    <a href="inscripcion.jsp">->Volver al Formulario</a> <br>  
    <a href="index.jsp">->Volver a inicio</a>
    </body>
</html>
