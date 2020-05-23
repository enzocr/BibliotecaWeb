<%-- 
    Document   : Inicio
    Created on : May 23, 2020, 10:58:26 AM
    Author     : Enzo Quartino Zamora <github.com/enzocr || email: enzoquartino@gmail.com>
--%>

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
        <% if (session.getAttribute("nombreUsuario") != null) {%>
        <div style="text-align: right; margin-right: 30px;">
            Hola <%= session.getAttribute("nombreUsuario")%>
            <br/>
            <%= new Date()%>
        </div>

        <h1>Números primos</h1>
        <%
            boolean esPrimo;
            for (int i = 0; i < 100; i++) {
                esPrimo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    out.println(i + "<br/>");
                }
            }
        %>




        <% } else { %>
        <p>Sesion invalida, vuelva a logearse</p>
        <a href ="logIn.html"> Ir al LogIn</a>

        <% }%>
    </body>
</html>
