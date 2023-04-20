package com.emergentes.practica_n2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesaLibro", urlPatterns = {"/procesaLibro"})
public class procesaLibro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String[] tipo = request.getParameterValues("tipo");
    
        registraLibro reglibro = new registraLibro ();
        reglibro.setNombre(nombre);
        reglibro.setAutor(autor);
        reglibro.setResumen(resumen);
        reglibro.setTipo(tipo);
    
        request.setAttribute("regLibro", reglibro );
        
        request.getRequestDispatcher("salidaLibro.jsp").forward(request, response);

    }

}
