<%-- 
    Document   : ajoutQuiz
    Created on : 27 juin 2016, 10:16:10
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
        <h1>Ajoutez un quiz</h1>

        <div class="contenu">
            <form method="post" >

                <p>
                    <label for="titre">Titre :</label>
                    <input type="text" name="titre" placeholder="Ex : james bond" size="30" maxlength="10" />
                </p>

                <input type="submit" value="ajouter" />
            </form>
    </body>
</html>
