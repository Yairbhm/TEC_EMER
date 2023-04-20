
package com.emergentes.practica_n2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesaInscripcion", urlPatterns = {"/procesaInscripcion"})
public class procesaInscripcion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
        String fecha = request.getParameter("fecha");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String turno = request.getParameter("turno");
        String[] seminarios = request.getParameterValues("seminarios");
    
        registraInscripcion reginscripcion = new registraInscripcion ();
        reginscripcion.setFecha(fecha);
        reginscripcion.setNombre(nombre);
        reginscripcion.setApellido(apellido);
        reginscripcion.setTurno(turno);
        reginscripcion.setSeminarios(seminarios);
    
        request.setAttribute("regInscripcion", reginscripcion );
        
        request.getRequestDispatcher("salidaInscripcion.jsp").forward(request, response);
    
    }
}
