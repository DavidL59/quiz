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
import quiz.entity.Question;
import quiz.entity.Quiz;
import quiz.service.QuestionService;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "Ajout", urlPatterns = {"/ajout_question"})
public class AjoutQuestionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        long idQuiz = (long) req.getSession().getAttribute("idQuizAct");
        Quiz quiz = new QuizService().rechercherParId(idQuiz);
        
        Question q = new Question();
        q.setTitre(req.getParameter("titre"));
        q.setOrdre(Long.parseLong(req.getParameter("ordre"))); 
        q.setReponse1(req.getParameter("r1"));
        q.setReponse2(req.getParameter("r2"));
        q.setReponse3(req.getParameter("r3"));
        q.setReponse4(req.getParameter("r4"));
        q.setNumRepnseCorrecte( Integer.parseInt(req.getParameter("numReponseCorrecte")) );
        quiz.getQuestions().add(q);
        q.setQuiz(quiz);

        // persiste
        new QuestionService().ajouter(q);
        // forward vers liste film 
        resp.sendRedirect("lister_questions");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("ajoutQuestion.jsp").forward(req, resp);
    }

}
