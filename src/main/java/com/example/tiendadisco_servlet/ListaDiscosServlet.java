package com.example.tiendadisco_servlet;


import com.example.tiendadisco_servlet.modelo.GestorConsultas;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "listaDiscosServlet", value = "/listadiscos-servlet")
public class ListaDiscosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String autor = request.getParameter("author_name");
        GestorConsultas gc = new GestorConsultas();
        String[] discos =  gc.buscaAutor(autor);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Tienda Discos</h1>");

        if(discos.length==0){
            out.println("<h2>Error con los datos introducidos</h2>");
            out.println("<p>No se ha encontrado el autor o grupo en el catálogo.</p>");
        }else{
            out.println("<h2>Lista de discos de " + autor + ":</h2>");
            out.println("<ul>");
            for(String d: discos){
                out.println("<li>" + d + "</li>");
            }
            out.println("</ul>");
        }

        out.println("<a href=\"formularioAutores.html\">Volver a introducir el autor/grupo</a>");
        out.println("<br/>");
        out.println("<a href=\"index.jsp\">Volver al menú principal</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}