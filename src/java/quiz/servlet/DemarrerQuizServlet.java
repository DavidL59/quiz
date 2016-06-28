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
@WebServlet(name = "DemarrerQuizServlet", urlPatterns = {"/demarrerQuiz"})
public class DemarrerQuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        req.getSession().setAttribute("score", 0);
        req.getSession().setAttribute("idQuiz", 0);
        req.getSession().setAttribute("ordre", 0);

        req.getRequestDispatcher("question_suivante.jsp").forward(req, resp);

    }

}
