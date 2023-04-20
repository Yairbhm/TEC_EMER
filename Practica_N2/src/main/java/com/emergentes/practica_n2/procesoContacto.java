
package com.emergentes.practica_n2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "procesoContacto", urlPatterns = {"/procesoContacto"})
public class procesoContacto extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String mensaje = request.getParameter("mensaje");
        String[] envia = request.getParameterValues("envia");
        
    
        registraContacto regcontacto = new registraContacto();
 
        regcontacto.setNombre(nombre);
        regcontacto.setCorreo(correo);
        regcontacto.setMensaje(mensaje);
        regcontacto.setEnvia(envia);
    
        request.setAttribute("regContacto", regcontacto );
        
        request.getRequestDispatcher("salidaContacto.jsp").forward(request, response);
    }

}
