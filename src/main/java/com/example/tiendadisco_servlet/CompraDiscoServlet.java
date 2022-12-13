package com.example.tiendadisco_servlet;

import com.example.tiendadisco_servlet.modelo.GestorConsultas;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "compraDiscoServlet", value = "/compradisco-servlet")
public class CompraDiscoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("FormularioCompra.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestorConsultas gc = new GestorConsultas();
        PrintWriter out = response.getWriter();
        String codigo = request.getParameter("cd_code");

        response.setContentType("text/html");
        out.println("<html><body>");
        out.println("<h1>Tienda Discos</h1>");

        String comprado;

        if(codigo != "") {
            comprado = gc.bajaDisco(Integer.parseInt(codigo));
        }else {
            comprado = "";
        }


        if(comprado==""){
            out.println("<h2>Error con los datos introducido</h2>");
            out.println("<p>No se ha encontrado el disco en el catálogo.</p>");
        }else{
            out.println("<h2>Compra de disco</h2>");
            out.println("<ul>");
            out.println("<p>"+comprado+"</p>");
        }

        out.println("<a href=\"FormularioCompra.jsp\">Volver a la opcion de compra</a>");
        out.println("<br/>");
        out.println("<a href=\"index.jsp\">Volver al menú principal</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
