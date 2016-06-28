<%-- 
    Document   : _TEMPLATE
    Created on : 24 juin 2016, 14:19:02
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
            <form method="post" >
                <p>
                    <label for="titre">Titre question :</label>
                    <input type="text" name="titre" placeholder="Ex : james bond" size="30" maxlength="10" />
                </p>
                <p>
                    <label for="titre">Ordre :</label>
                    <input type="text" name="ordre" placeholder= size="30" maxlength="100" />
                </p>
                <p>
                    <label for="titre">R1 :</label>
                    <input type="text" name="r1" placeholder= size="30" maxlength="100" />
                </p>
                <p>
                    <label for="titre">R2 :</label>
                    <input type="text" name="r2" placeholder= size="30" maxlength="100" />
                </p>
                <p>
                    <label for="titre">R3 :</label>
                    <input type="text" name="r3" placeholder= size="30" maxlength="100" />
                </p
                <p>
                    <label for="titre">R4 :</label>
                    <input type="text" name="r4" placeholder= size="30" maxlength="100" />
                </p>
                <p>
                    <label for="titre">Réponse correcte:</label>
                    <input type="text" name="numReponseCorrecte" placeholder= size="30" maxlength="100" />
                </p>
                <input type="submit" value="ajouter" />

            </form>
        </div>
    </body>
</html>