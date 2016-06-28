<%-- 
    Document   : questio_suivante
    Created on : 28 juin 2016, 16:14:02
    Author     : admin
--%>

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
                    ${quiz.id},${question.id},${question.ordre} ,${question.titre}                
                </p>

                <p>
                    <label for="titre">R1 :</label>
                    <input type="radio" name="r1"  />
                </p>
                <p>
                    <label for="titre">R2 :</label>
                    <input type="radio" name="r2"  />
                </p>
                <p>
                    <label for="titre">R3 :</label>
                    <input type="radio" name="r3"  />
                </p
                <p>
                    <label for="titre">R4 :</label>
                    <input type="radio" name="r4"  />
                </p>

                <input type="submit" value="ajouter" />

            </form>
        </div>
    </body>
</html>