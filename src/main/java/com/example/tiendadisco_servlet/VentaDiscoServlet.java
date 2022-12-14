package com.example.tiendadisco_servlet;

import com.example.tiendadisco_servlet.modelo.GestorConsultas;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ventaDiscoServlet", value = "/ventadisco-servlet")
public class VentaDiscoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("FormularioVenta.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String codigo = request.getParameter("cd_code");
        GestorConsultas gc = new GestorConsultas();
        String vendido;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Tienda Discos</h1>");

        if(codigo != "") {
            vendido = gc.altaDisco(Integer.parseInt(codigo));
        }else {
            vendido = "";
        }

        if (vendido == "") {
            out.println("<h2>Error con los datos introducido</h2>");
            out.println("<p>No se ha encontrado el disco en el catálogo.</p>");
        } else {
            out.println("<h2>Venta de disco</h2>");
            out.println("<ul>");
            out.println("<p>" + vendido + "</p>");
        }

        out.println("<a href=\"FormularioVenta.jsp\">Volver a la opcion de venta</a>");
        out.println("<br/>");
        out.println("<a href=\"index.jsp\">Volver al menú principal</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
