/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author admin
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/page_connexion"})
public class ConnexionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              
     
//recupere le login et mdp et stocke valeurs dans variables 
       String login= req.getParameter("login");
       String mdp = req.getParameter("pwd");
       
              
        if (login.equals("admin") && mdp.equals("admin")) {
            req.getSession().setAttribute("admin", "admin");
             resp.sendRedirect("liste_quiz"); // renvoi vers la route de la servlet listerQuizServlet
        }
               
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         req.getRequestDispatcher("pageDeConnexion.jsp").forward(req, resp);
    }


}
