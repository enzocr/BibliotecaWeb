<%-- 
    Document   : Inicio
    Created on : May 23, 2020, 10:58:26 AM
    Author     : Enzo Quartino Zamora <github.com/enzocr || email: enzoquartino@gmail.com>
--%>

<%@page import="clases.Promedio"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function accion(var valor) {
                document.getElementById("oculto").value = valor;
            }

        </script>

    </head>
    <body>
        <%! Promedio elPromedio = new Promedio();%>
        <% if (session.getAttribute("nombreUsuario") != null) {%>
        <div style="text-align: right; margin-right: 30px;">
            Hola <%= session.getAttribute("nombreUsuario")%>
            <br/>
            <%= new Date()%>
        </div>

        <h1>Calculo de promedios</h1>

        <form method="get" action="calculaPromedio.jsp">

            <table>
                <tr>
                    <td>Número 1</td>
                    <td>
                        <input type="text" name="num1"/>
                    </td>
                </tr>
                <tr>
                    <td>Número 2</td>
                    <td>
                        <input type="text" name="num2"/>
                    </td>
                </tr>
                <tr>
                    <td>Numero 3</td>
                    <td>
                        <input type="text" name="num3"/>
                    </td>
                </tr>
                <tr>
                    <td>Número 4</td>
                    <td>
                        <input type="text" name="num4"/>
                    </td>
                </tr>
                <tr>
                    <td>Número 5</td>
                    <td>
                        <input type="text" name="num5"/>
                    </td>
                </tr>
            </table>

            <input type="submit" value="Calcular"/>


        </form>

        <%
            if (request.getParameter("num1") != null) {
                elPromedio.setNum1(Integer.parseInt(request.getParameter("num1")));
                elPromedio.setNum2(Integer.parseInt(request.getParameter("num2")));
                elPromedio.setNum3(Integer.parseInt(request.getParameter("num3")));
                elPromedio.setNum4(Integer.parseInt(request.getParameter("num4")));
                elPromedio.setNum5(Integer.parseInt(request.getParameter("num5")));
                out.println("PROMEDIO: " + elPromedio.calculaPromedio());
            }
        %>


        <% } else { %>
        <p>Sesion invalida, vuelva a logearse</p>
        <a href ="logIn.html"> Ir al LogIn</a>
        <% }%>
    </body>
</html>
