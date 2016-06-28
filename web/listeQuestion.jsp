<%-- 
    Document   : listeQuestion
    Created on : 24 juin 2016, 14:16:27
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp">

            </c:import>
        </div>

        <div class="contenu">
            
            <h2>Questions du quiz: ${quizAct.titre}</h2>

            <a href="ajout_question">Nouvelle question</a>
            <br><br>
            
            <c:forEach items="${quizAct.questions}" var="questionAct">
                ${questionAct.ordre} ${questionAct.titre}</br>
            </c:forEach>

        </div>
    </body>
</html>
