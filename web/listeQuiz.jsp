<%-- 
    Document   : quiz
    Created on : 24 juin 2016, 14:15:38
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

            <h2>Liste de quiz</h2>
            <c:forEach items="${listeQuiz}" var="monQuiz">
                <a href="change_quiz?idQuiz=${monQuiz.id}">${monQuiz.titre}</a></br>
            </c:forEach>

        </div>
    </body>
</html>
