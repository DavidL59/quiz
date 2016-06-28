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
import quiz.entity.Question;
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "listerQuestionServlet", urlPatterns = {"/lister_questions"})
public class ListerQuestionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        // Crée un attribut de req avec le quiz actuel
        long idQuiz = (long) req.getSession().getAttribute("idQuizAct");
        Quiz quiz = new QuizService().rechercherParId(idQuiz);
        req.setAttribute("quizAct", quiz);
        
        // Forward
         req.getRequestDispatcher("listeQuestion.jsp").forward(req, resp);
    }



}
