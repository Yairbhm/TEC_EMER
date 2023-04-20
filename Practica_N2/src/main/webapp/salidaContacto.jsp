<%@page import="com.emergentes.practica_n2.registraContacto"%>
<% registraContacto regcontacto =(registraContacto) request.getAttribute("regContacto");
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
    <center><h1>Conctactados exitosamente</h1></center>
    <b>Gracias por contactarnos</b>
    <p>Nombre: <%= regcontacto.getNombre() %></p>
    <p>Correo: <%= regcontacto.getCorreo() %></p>
    <p>Mensaje: <%= regcontacto.getMensaje() %></p>
    <b>Nos contactaremos lo mas pronto posible</b>  <br> 
    
    <a href="contacto.jsp">->Volver al Formulario</a> <br>  
    <a href="index.jsp">->Volver a inicio</a>
    </body>
</html>

