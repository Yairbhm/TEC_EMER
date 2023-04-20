<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        label, input[type="text"], input[type="checkbox"], input[type="submit"] {
            font-family: Century Gothic;
            line-height: .5;
        } 
    table {
        border-collapse: collapse;
        width: 100%;
    }

    td {
        padding: 8px;
        text-align: left;
        white-space: nowrap;    
    }
    label {
    
        display: inline-block;
        width: 200px;
        margin-bottom: 10px;
        
   
    }

    input[type="text"], select, input[type="password"] {
        padding: 8px;
        margin-bottom: 15px;
        
    }

   
</style>
    </head>
    
    
    <body>
      <form action="procesaUsuario" method="post">
          <div style="margin-left: 50px"><h1>Registro de Usuarios</h1>
        </div>
    <table class="formulario">
        <tr>
            <td>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" required>
                <br>
                <label for="apellido">Apellidos:</label>
                <input type="text" name="apellidos" id="apellido" required>
                <br>
                <label for="correo">Correo Electronico:</label>
                <input type="text" name="correo" id="correo" required>
                <br>
                <label for="contra">Contraseña:</label>
                <input type="password" name="contra" id="contra" required>
                <br>
                <div style="margin-left: 200px">
                <button  type="submit">Enviar</button>
                </div>
            </td>
            
        </tr>
    </table>
</form>
        </body>
</html>

