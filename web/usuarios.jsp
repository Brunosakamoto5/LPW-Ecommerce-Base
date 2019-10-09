<%--
    Document   : usuarios
    Created on : 09/10/2019, 16:07:57
    Author     : brunosakamoto5
--%>

<%@page import="modelos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <title>Usuarios</title>
   </head>
      <body>
         <%
             boolean logado =  false;

            if(session != null && session.getAttribute("logado") !=null){
                logado = (boolean) session.getAttribute("logado");
             }

            if(!logado){
         %>
         <jsp:forward page="login.jsp"/>
         <%

            }
            %>
      <jsp:include page="menu.jsp">
         <jsp:param name="item" value="" />

         </jsp:include>



      <h1>Lista de Usuários do Sistema</h1>


            <table class="table table-striped ">
               <thead>
                  <tr>
                     <th>#</th>
                     <th>Usuario</th>
                     <th>Email</th>
                     <th>Senha</th>
                  </tr>
               </thead>
               <tbody>

<%
                     for (int i = 0; i < Usuario.getLista().size(); i++) {

                        Usuario p = Usuario.getLista().get(i);

                        out.println("<tr>");
                        out.println("<td> " + (i + 1) + " </td>");
                        out.println("<td> " + p.getNome() + " </td>");
                        out.println("<td> " + p.getEmail() + " </td>");
                        out.println("<td> " + p.getSenha() + " </td>");

                        out.println("</tr>");

                     }

                  %>
               </tbody>
            </table>
         </div>

         <script src="js/bootstrap.min.js"></script>



   </body>
</html>
