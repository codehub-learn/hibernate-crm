package gr.codehub.hibernate;

import gr.codehub.hibernate.JpaUtil.JpaUtil;
import gr.codehub.hibernate.model.Customer;

import javax.persistence.EntityManager;
import javax.swing.*;

public class ApplicationMain {
    public static void main(String[] args) {


        EntityManager entityManager = JpaUtil.getEntityManager();


        Customer customer = new Customer();
        customer.setFirstName("Dimitris");
        customer.setLastName("Dimitriou");
        customer.setAddress("Athens");

        System.out.println(customer.getId());

        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();


        System.out.println(customer.getId());

        entityManager.close();

    }

}
