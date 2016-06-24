<%-- 
    Document   : home
    Created on : 24 juin 2016, 15:53:37
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
            <c:import url="_TITRE.jsp"/>
        </div>


        <div class="contenu">
            
            <form method="post">
                <p>
                    <label for="titre">login :</label>
                    <input type="text" name="login" placeholder="" size="30" maxlength="10" />
                </p>

                <p>
                    <label for="pseudo">mot de passe :</label>
                    <input type="password" name="pwd" placeholder="" size="30" maxlength="120" />
                </p>

                <input type="submit" value="ajouter" />
        </div>

    </form>

</body>
</html>
