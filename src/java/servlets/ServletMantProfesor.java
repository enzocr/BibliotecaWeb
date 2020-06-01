/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.bo.ProfesorBo;
import negocio.clases.Profesor;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class ServletMantProfesor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mantenimiento de Profesores</title>");
            out.println("</head>");
            out.println("<body>");

            ProfesorBo profesorBo = new ProfesorBo();
            Profesor elProfesor;
            String accion = request.getParameter("accion");

            switch (accion) {
                case "REGISTRAR":
                    elProfesor = new Profesor();
                    elProfesor.setCedula(Integer.parseInt(request.getParameter("cedula")));
                    elProfesor.setNombre(request.getParameter("nombre"));
                    elProfesor.setSalario(new Double(request.getParameter("salario")));
                    elProfesor.setEscuela(request.getParameter("escuela"));

                    int res = profesorBo.insert(elProfesor);

                    switch (res) {
                        case 0:
                            out.print("<h1>Agregado</h>");
                            break;
                        case 1:
                            out.print("<h1>No se pudo conectar a la BD </h>");
                            break;
                        case 2:
                            out.print("<h1>Profesor con cédula indicada ya existe</h>");
                            break;
                        case 3:
                            out.print("<h1>Ocurrió un error inesperado</h>");
                            break;
                    }
                    break;
                case "SELECCIONAR":
                    Integer cedula = Integer.parseInt(request.getParameter("seleccionado"));
                    elProfesor = profesorBo.getById(cedula);
                    request.setAttribute("cedula", elProfesor.getCedula());
                    request.setAttribute("nombre", elProfesor.getNombre());
                    request.setAttribute("salario", elProfesor.getSalario());
                    request.setAttribute("escuela", elProfesor.getEscuela());
                    
                    request.getRequestDispatcher("mantProfesor.jsp").forward(request, response);
                    break;
            }

            out.println("<br/>");
            out.println("<a href=\"mantProfesor.jsp\">Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
