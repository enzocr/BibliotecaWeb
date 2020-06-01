<%-- 
    Document   : Inicio
    Created on : May 23, 2020, 10:58:26 AM
    Author     : Enzo Quartino Zamora <github.com/enzocr || email: enzoquartino@gmail.com>
--%>

<%@page import="negocio.bo.ProfesorBo"%>
<%@page import="negocio.clases.Profesor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function validarDatos() {
                // document.getElementById("oculto").value = valor;
                return true;
            }
            function registrar() {
                if (validarDatos()) {
                    document.getElementById("oculto").value = "REGISTRAR";
                    return true;
                } else {
                    return false;
                }
            }
            function modificar() {

            }
            function eliminar() {

            }
            function getById() {

            }
            function getByName() {

            }
            function seleccionar(cedula) {
                document.getElementById("oculto").value = "SELECCIONAR";
                document.getElementById("seleccionado").value = cedula;
            }

        </script>

    </head>
    <body>
        <% if (session.getAttribute("nombreUsuario") != null) {%>
        <div style="text-align: right; margin-right: 30px;">
            Hola <%= session.getAttribute("nombreUsuario")%>
            <br/>
            <%= new Date()%>
        </div>

        <h1>Mantenimiento de Profesor</h1>

        <form method="get" action="ServletMantProfesor">
            <table border="1">
                <tr>
                    <td>Nombre</td>
                    <td>
                        <input type="text" id="txtNombre" name="nombre" value="<%=request.getAttribute("nombre")%>"/>
                    </td>
                </tr>
                <tr>
                    <td>Cedula</td>
                    <td>
                        <input type="text" id="txtCedula" name="cedula" value="<%=request.getAttribute("cedula")%>"/>
                    </td>
                </tr>
                <tr>
                    <td>Salario</td>
                    <td>
                        <input type="number" step="0.01" id="txtSalario" name="salario" value="<%=request.getAttribute("salario")%>"/>
                    </td>
                </tr>
                <tr>
                    <td>Escuela</td>
                    <td>
                        <input type="text" id="txtEscuela" name="escuela" value="<%=request.getAttribute("escuela")%>"/>
                    </td>
                </tr>
            </table>
            <br/>
            <input type="submit" value="Registrar" onclick="return registrar();"/>
            <input type="submit" value="Modificar" onclick="return modificar();"/>
            <input type="submit" value="Eliminar" onclick="return eliminar();"/>
            <input type="submit" value="Consultar por cédula" onclick="return getById();"/>
            <input type="submit" value="Consultar por nombre" onclick="return getByName();"/>
            <input type ="hidden" id="oculto" name="accion"/>
            <input type ="hidden" id="seleccionado" name="seleccionado"/>
            <hr/>
            <table border="1">
                <tr>
                    <th>Cédula</th>
                    <th>Nombre</th>
                    <th>Salario</th>
                    <th>Escuela</th>
                    <th>Seleccionar</th>
                </tr>
                <%! List<Profesor> list = new ArrayList<>(); %>
                <%! ProfesorBo profeBo = new ProfesorBo();%>
                <%
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

                %>
                <td>
                    <input type="image" src="img/select.png"
                           width="25px" onclick="return seleccionar(<%= prof.getCedula()%>)" />
                </td>
                <%  out.println("</tr>");
                    }
                %>
            </table>
        </form>




        <% } else { %>
        <p>Sesion invalida, vuelva a logearse</p>
        <a href ="logIn.html"> Ir al LogIn</a>

        <% }%>
    </body>
</html>
