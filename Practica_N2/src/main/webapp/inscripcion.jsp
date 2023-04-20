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
        width: 50%;
    }

    td {
        padding: 8px;
        text-align: left;
        white-space: nowrap;    
    }
    label {
    
        display: inline-block;
        width: 120px;
        margin-bottom: 10px;
        
   
    }

    input[type="text"], select, input[type="date"] {
        padding: 8px;
        margin-bottom: 10px;
    }

   
</style>
    </head>
    
    
    <body>
      <form action="procesaInscripcion" method="post">
          <div style="margin-left: 50px"><h1>Incripcion en Seminarios</h1>
        </div>
    <table class="formulario">
        <tr>
            <td>
                <label for="fecha">Fecha:</label>
                <input type="date" name="fecha" id="fecha" required>
                <br>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" required>
                <br>
                <label for="apellido">Apellido:</label>
                <input type="text" name="apellido" id="apellido" required>
                <br>
                <label for="turno">Turno:</label>
                <select name="turno" id="turno" required>
                    <option value="">Seleccione un turno</option>
                    <option value="mañana">Mañana</option>
                    <option value="tarde">Tarde</option>
                </select>
                
                <div style="margin-left: 120px">
                <button  type="submit">Enviar</button>
                </div>
            </td>
            <td>
                <label class="checkbox"><input type="checkbox" name="seminarios" value="5G">5G</label>
                <br>
                <label class="checkbox"><input type="checkbox" name="seminarios" value="Inteligencia Artificial ">Inteligencia Artificial</label>
                <br>
                <label class="checkbox"><input type="checkbox" name="seminarios" value="Machine learnig ">Machine learnig</label>
                <br>
                <label class="checkbox"><input type="checkbox" name="seminarios" value="Robotica">Robotica</label>
            </td>
        </tr>
    </table>
</form>
        </body>
</html>
