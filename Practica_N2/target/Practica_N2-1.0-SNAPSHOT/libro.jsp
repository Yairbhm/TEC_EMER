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

    input[type="text"] {
        padding: 8px;
        margin-bottom: 15px;
    }
    input[type="texarea"]{
        padding: 1px;
        margin-bottom: 0px;
    }
   
</style>
    </head>
    
    
    <body>
      <form action="procesaLibro" method="post">
          <div style="margin-left: 50px"><h1>Registro de libros</h1>
        </div>
    <table class="formulario">
        <tr>
            <td>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" required>
                <br>

                <label for="autor">Autor:</label>
                <input type="text" name="autor" id="autor" required>
                <br>
                <label for="resumen">Resumen:</label>
                 <textarea id="resumen" name="resumen" required></textarea><br>
                <br>
                <div>
                <label for="medio">Medio:</label>
                <div style="margin-left: 200px">
                <input type="radio" id="fisico" name="tipo" value="fisico">
                <label for="fisico">Físico</label>
                </div>
                <div style="margin-left: 200px">
                <input type="radio" id="magnetico" name="tipo" value="magnetico">
                <label for="magnetico">Magnetico</label>
                </div>
                <div style="margin-left: 205px">
                <button  type="submit">Enviar</button>
                </div>
            </td>
            
        </tr>
    </table>
</form>
        </body>
</html>



