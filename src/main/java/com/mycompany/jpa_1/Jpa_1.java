/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpa_1;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author bhats
 */
public class Jpa_1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_jpa_1_jar_SNAPSHOT-1-0-0PU");
        System.out.println("################## HI 1 ################### ");
        System.out.println("emf.isOpen: " + emf.isOpen()) ;
        
        EntityManager em = emf.createEntityManager();
        System.out.println("em.isOpen: " + em.isOpen()) ;
        System.out.println("################## HI 2 ################### ");
        
        TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
        List<User> results = query.getResultList();
        System.out.println("################## HI 3 ################### ");
        for (User u : results) {
            System.out.println(u);
        }
        System.out.println("################## HI 4 ################### ");

        for (User u: results) {
            System.out.println(u.getUserID() + " " + u.getPassword());
        }
        System.out.println("################## HI 6 ################### ");

    }
}
