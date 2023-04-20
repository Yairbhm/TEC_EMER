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
@WebServlet(name = "RespXLS", urlPatterns = {"/RespXLS"})
public class RespXLS extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("aplication/vn.ms-excel");
        response.setHeader("Content_Disposition", "attachment;filename=archivo.xls");
        PrintWriter out = response.getWriter();
        try{
            out.println("Respuesta Generda desde Excel");
            out.println("100");
            out.println("200");
            out.println("La suma es:\t");
            out.println("=suma(a2:a3");
        }finally{
            out.close();
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
