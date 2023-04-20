
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brayhan Eduardo Huanca Mamani 7C
 */
@WebServlet(name = "main", urlPatterns = {"/main"})
public class main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario de datos</h1>");
            out.println("<form action='' method='post'>");
            out.println("<label>Nombre</label><br>");
            out.println("<input type='text' name='nombre'><br>");
            out.println("<label>Telefono</label><br>");
            out.println("<input type='text' name='telefono'><br>");
            out.println("<label>Email</label><br>");
            out.println("<input type='email' name='email'><br>");
            out.println("<input type='submit' value='Enviar'> ");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }        
        
    }


  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        
        response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos recibidos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos recibidos</h1>");
            out.println("<p>Los datos recibidos son: </p>");
            out.println("<br>");
            
            out.println("<p>Nombre: "+nombre+"</p>");
            out.println("<p>Telefono: "+telefono+" </p>");
            out.println("<p>Correo: "+email+" </p>");
            out.println("<br>");
            
            out.println("<a href='main'>Volver</a>");
            
            out.println("</body>");
            out.println("</html>");
        } 
    
    }


}
