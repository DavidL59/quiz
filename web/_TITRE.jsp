<%-- 
    Document   : _TITRE
    Created on : 24 juin 2016, 14:19:29
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <h1>QUIZ JAVA</h1>
        <a href="liste_quiz">Liste quiz</a>
        <a href="page_connexion">Connection</a>
        <a href="demarrerQuiz">demarrer quiz</a>
        
        <c:if test="${admin=='admin'}">
         <a href="ajout_quiz">ajouter quiz</a>
        <a href="page_deconnexion">deconnection</a>
       </c:if>

