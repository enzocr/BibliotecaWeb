package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import negocio.bo.ProfesorBo;
import negocio.clases.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public final class mantProfesor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 List<Profesor> list = new ArrayList<>(); 
 ProfesorBo profeBo = new ProfesorBo();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validarDatos() {\n");
      out.write("                // document.getElementById(\"oculto\").value = valor;\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            function registrar() {\n");
      out.write("                if (validarDatos()) {\n");
      out.write("                    document.getElementById(\"oculto\").value = \"REGISTRAR\";\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function modificar() {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function eliminar() {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function getById() {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function getByName() {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function seleccionar(cedula) {\n");
      out.write("                document.getElementById(\"oculto\").value = \"SELECCIONAR\";\n");
      out.write("                document.getElementById(\"seleccionado\").value = cedula;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 if (session.getAttribute("nombreUsuario") != null) {
      out.write("\n");
      out.write("        <div style=\"text-align: right; margin-right: 30px;\">\n");
      out.write("            Hola ");
      out.print( session.getAttribute("nombreUsuario"));
      out.write("\n");
      out.write("            <br/>\n");
      out.write("            ");
      out.print( new Date());
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h1>Mantenimiento de Profesor</h1>\n");
      out.write("\n");
      out.write("        <form method=\"get\" action=\"ServletMantProfesor\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nombre</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"txtNombre\" name=\"nombre\" value=\"");
      out.print(request.getAttribute("nombre"));
      out.write("\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Cedula</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"txtCedula\" name=\"cedula\" value=\"");
      out.print(request.getAttribute("cedula"));
      out.write("\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Salario</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"number\" step=\"0.01\" id=\"txtSalario\" name=\"salario\" value=\"");
      out.print(request.getAttribute("salario"));
      out.write("\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Escuela</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"txtEscuela\" name=\"escuela\" value=\"");
      out.print(request.getAttribute("escuela"));
      out.write("\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" value=\"Registrar\" onclick=\"return registrar();\"/>\n");
      out.write("            <input type=\"submit\" value=\"Modificar\" onclick=\"return modificar();\"/>\n");
      out.write("            <input type=\"submit\" value=\"Eliminar\" onclick=\"return eliminar();\"/>\n");
      out.write("            <input type=\"submit\" value=\"Consultar por cédula\" onclick=\"return getById();\"/>\n");
      out.write("            <input type=\"submit\" value=\"Consultar por nombre\" onclick=\"return getByName();\"/>\n");
      out.write("            <input type =\"hidden\" id=\"oculto\" name=\"accion\"/>\n");
      out.write("            <input type =\"hidden\" id=\"seleccionado\" name=\"seleccionado\"/>\n");
      out.write("            <hr/>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Cédula</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Salario</th>\n");
      out.write("                    <th>Escuela</th>\n");
      out.write("                    <th>Seleccionar</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");

                    this.list = profeBo.getAll();
                    for (int i = 0; i < list.size(); i++) {
                        Profesor prof = list.get(i);
                        out.println("<tr>");

                        out.println("<td>");
                        out.println(prof.getCedula());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(prof.getNombre());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(prof.getSalario());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(prof.getEscuela());
                        out.println("</td>");

                
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"image\" src=\"img/select.png\"\n");
      out.write("                           width=\"25px\" onclick=\"return seleccionar(");
      out.print( prof.getCedula());
      out.write(")\" />\n");
      out.write("                </td>\n");
      out.write("                ");
  out.println("</tr>");
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        <p>Sesion invalida, vuelva a logearse</p>\n");
      out.write("        <a href =\"logIn.html\"> Ir al LogIn</a>\n");
      out.write("\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
