package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "WelcomeServlet", urlPatterns = {"/WelcomeServlet"})
public class WelcomeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        boolean visitedBefore = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitedBefore")) {
                    visitedBefore = true;
                    break;
                }
            }
        }
        
        if (visitedBefore) {
            out.println("<h1>Gracias por visitarnos nuevamente</h1>");
        } else {
            Cookie visitedCookie = new Cookie("visitedBefore", "true");
            visitedCookie.setMaxAge(20); 
            response.addCookie(visitedCookie);
            out.println("<h1>Bienvenido a nuestro sitio web</h1>");
        }
         }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 


}
