/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
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

    public void ajouter(Question s) {

        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();

    }
    
        public List<Question> listerTous(){
        
        EntityManager em = Persistence.createEntityManagerFactory("quizPU").createEntityManager(); 
        
        return em.createQuery("select q from Question q ").getResultList();
    }
}
