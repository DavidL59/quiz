/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import java.util.List;
import quiz.dao.QuizDAO;

import quiz.entity.Question;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuizService {
    
        public Quiz rechercherParId(long id) {

        QuizDAO dao = new QuizDAO();
        return dao.rechercherParId(id);

    }

    public List<Quiz> lister() {
        QuizDAO dao = new QuizDAO();
        return dao.listerTous();
    }

    public void ajouter(Quiz s) {
        new QuizDAO().ajouter(s);
    }

    public void modifier(Quiz quiz) {
        new QuizDAO().modifier(quiz);
    }

    public void supprimer(long id) {
        new QuizDAO().supprimer(id);
    }
}
