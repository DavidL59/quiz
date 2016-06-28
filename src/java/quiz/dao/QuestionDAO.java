/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionDAO {

    public Question rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();

        return em.find(Question.class, id);

    }

    public void ajouter(Question q) {

        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(q);
        em.getTransaction().commit();

    }

    public List<Question> listerTous() {

        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();

        return em.createQuery("select q from Question q ").getResultList();
    }

    public void modifier(Question question) {
        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(question);
        em.getTransaction().commit();
    }

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();
        em.getTransaction().begin();
        Question q = em.find(Question.class, id);
        em.remove(q);
        em.getTransaction().commit();
    }
}
