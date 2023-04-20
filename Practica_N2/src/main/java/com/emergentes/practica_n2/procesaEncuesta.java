
package com.emergentes.practica_n2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesaEncuesta", urlPatterns = {"/procesaEncuesta"})
public class procesaEncuesta extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String[] sistemasOperativos = request.getParameterValues("sistemasOperativos");
    
        registraEncuesta regencuesta = new registraEncuesta ();
        regencuesta.setNombre(nombre);
        regencuesta.setSistemasOperativos(sistemasOperativos);
    
        request.setAttribute("regEncuesta", regencuesta );
        
        request.getRequestDispatcher("salidaEncuesta.jsp").forward(request, response);
    }
   

}
