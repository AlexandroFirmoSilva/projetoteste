<%-- 
    Document   : teste
    Created on : 30/09/2017, 23:56:00
    Author     : alex
--%>

<%@page import="java.util.List"%>
<%@page import="com.projeto.puroverde.entity.Comentario"%>
<%@page import="com.puroverde.service.ProdutoService"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
            ProdutoService p = new ProdutoService();
            out.print(p.Busca(1l).getComentarios().isEmpty());
            
            
          ///  out.print(d);
        %>
    </body>
</html>
