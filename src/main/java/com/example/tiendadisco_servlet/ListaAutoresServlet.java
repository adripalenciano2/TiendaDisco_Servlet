package com.example.tiendadisco_servlet;

import com.example.tiendadisco_servlet.modelo.GestorConsultas;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "listaAutoresServlet", value = "/listaautores-servlet")
public class ListaAutoresServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestorConsultas gc = new GestorConsultas();
        String[] autores =  gc.listaAutores();
        response.setContentType("text/html");

        // Montamos html
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Tienda Discos</h1>");

        out.println("<h2>Lista de autores y grupos</h2>");
        out.println("<ul>");
        for(String a: autores){
            out.println("<li>" + a + "</li>");
        }
        out.println("</ul>");
        out.println("<a href=\"index.jsp\">Volver al menú principal</a>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destroy() {
    }
}
