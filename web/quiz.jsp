<%-- 
    Document   : quiz
    Created on : 24 juin 2016, 14:15:38
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
            <c:import url="_TITRE.jsp">
                
            </c:import>
        </div>
        
        <div class="contenu">
            
            <a href=""
            <form method="post" >
                
                <h2>Depuis combien d'année existe java</h2

                <p>
                    <input type="radio" name="age" value="moins15"/>
                    <label for="moins15">plus de 15 ans</label><br />
                </p>
                
                 <p>
                    <input type="radio" name="age" value="moins15"/>
                    <label for="moins15">Moins de 5 ans</label><br />
                </p>
                <p>
                    <input type="radio" name="age" value="moins15"/>
                    <label for="moins15">Moins de 10 ans</label><br />
                </p>
            </form>
        </div>
    </body>
</html>
