/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutQuizServlet", urlPatterns = {"/ajout_quiz"})
public class AjoutQuizServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Quiz s = new Quiz();
        s.setTitre(req.getParameter("titre"));
        // persiste
        new QuizService().ajouter(s);

        // forward vers liste film 
        resp.sendRedirect("liste_quiz");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Quiz> quizlist = new QuizService().lister();

        req.setAttribute("quiz", quizlist);

        req.getRequestDispatcher("ajoutQuiz.jsp").forward(req, resp);
    }

}
