package com.emergentes.practica_n2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "procesaUsuario", urlPatterns = {"/procesaUsuario"})
public class procesaUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String correo = request.getParameter("correo");
        String contra= request.getParameter("contra");
    
        registraUsuario regusuario = new registraUsuario();
 
        regusuario.setNombre(nombre);
        regusuario.setApellidos(apellidos);
        regusuario.setCorreo(correo);
        regusuario.setContra(contra);
    
        request.setAttribute("regUsuario", regusuario );
        
        request.getRequestDispatcher("salidaUsuario.jsp").forward(request, response);
    }


}
