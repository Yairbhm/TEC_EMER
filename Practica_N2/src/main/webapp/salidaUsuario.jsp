<%@page import="com.emergentes.practica_n2.registraUsuario"%>
<% registraUsuario regusuario =(registraUsuario) request.getAttribute("regUsuario");
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
    <center><h1>Resultados de Registro de Usuario</h1></center>
    <b>Datos Personales:</b>
    <p>Nombre: <%= regusuario.getNombre() %></p>
    <p>Apellidos: <%= regusuario.getApellidos() %></p>
    <p>Correo: <%= regusuario.getCorreo() %></p>
    <p>Contraseña: <%= regusuario.getContra() %></p>

    <a href="registrousuarios.jsp">->Volver al Formulario</a> <br>  
    <a href="index.jsp">->Volver a inicio</a>
    </body>
</html>
