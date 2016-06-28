/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import java.util.List;
import quiz.dao.QuestionDAO;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionService {

    public Question rechercherParId(long id) {

        QuestionDAO dao = new QuestionDAO();
        return dao.rechercherParId(id);

    }

    public List<Question> lister() {
        QuestionDAO dao = new QuestionDAO();
        return dao.listerTous();
    }

    public void ajouter(Question q) {
        new QuestionDAO().ajouter(q);
    }

    public void modifier(Question question) {
        new QuestionDAO().modifier(question);
    }

    public void supprimer(long id) {
        new QuestionDAO().supprimer(id);
    }
}
