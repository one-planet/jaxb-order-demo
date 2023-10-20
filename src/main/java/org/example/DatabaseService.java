package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseService {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("your-pu");

    public void saveXmlToDatabase(String xmlContent) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        OrderTable OrderTable = new OrderTable();
        OrderTable.setId(System.currentTimeMillis()); // Just an example, use a proper ID generator
        OrderTable.setXmlContent(xmlContent);
        em.persist(OrderTable);
        em.getTransaction().commit();
        em.close();
    }
}
