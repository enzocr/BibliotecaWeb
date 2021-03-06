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
            function accion(valor) {
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

        <h1>Bienvenido al sistema BiblioWeb</h1>
        <form method="get" action="ServletMenu">
            <input type="submit" value="Datos del profesor" onclick="accion(1)">
            <input type="submit" value="Formulario" onclick="accion(2)">
            <input type="submit" value="Primos" onclick="accion(3)">
            <input type="submit" value="Calcular promedio" onclick="accion(4)">
            <input type="submit" value="Mantenimiento del profesor" onclick="accion(5)">
            <input type="hidden" id="oculto" name="boton"/>
        </form>




        <% } else { %>
        <p>Sesion invalida, vuelva a logearse</p>
        <a href ="logIn.html"> Ir al LogIn</a>
        <% }%>
    </body>
</html>
