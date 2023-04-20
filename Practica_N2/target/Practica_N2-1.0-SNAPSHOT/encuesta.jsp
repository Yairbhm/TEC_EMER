<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    
        <title>Formulario de Encuesta</title>
   
   <style>
        body {
            font-family: Century Gothic;
            line-height: 1.5;
        }
        label, input[type="text"], input[type="checkbox"], input[type="submit"] {
            font-family: Century Gothic;
            line-height: .5;
        }
        input[type="text"] {
        padding: 8px;
        width: 300px;
        margin-bottom: 15px;
    }
    
    </style>
    </head>
    <body>
        <div style="margin-left: 50px"><h1>Encuesta de Sistemas Operativos</h1>
        </div>
        
        <form action="procesaEncuesta" method="post">
            <div>
               <label  for="nombre">Nombre:</label>
            <input type="text" name="nombre" id="nombre">
            </div>
            <div style="margin-left: 68px">
                <input type="checkbox" name="sistemasOperativos" value="Windows">Windows<br>
                <input type="checkbox" name="sistemasOperativos" value="MacOS">MacOS<br>
                <input type="checkbox" name="sistemasOperativos" value="Linux">Linux<br>
                <input type="checkbox" name="sistemasOperativos" value="iOS">iOS<br>
                <input type="checkbox" name="sistemasOperativos" value="Android">Android<br>
                <input type="submit" value="Enviar">
            </div>
            
        </form>
    </body>
</html>



