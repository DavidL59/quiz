/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuizDAO {

    public Quiz rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();

        return em.find(Quiz.class, id);

    }

    public void ajouter(Quiz s) {

        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();

    }
    
        public List<Quiz> listerTous(){
        
        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager(); 
        
        return em.createQuery("select s from Quiz s ").getResultList();
    }
}
