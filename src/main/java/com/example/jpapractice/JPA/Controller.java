package com.example.jpapractice.JPA;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
@Slf4j
public class Controller {
    @Bean
    public void Display() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student_info");
        log.info("Object for EntityManagerfactory is created");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Book book = new Book();
        //book.setId(13);
        book.setBookName("Monk who lost his ferrari");
        book.setBookNumber("1234");
        Student student = new Student();
        student.setBook(book);
        student.setId(13);
        student.setClassName("EEE_A");
        student.setName("Guna Teja");
        entityManager.persist(student);
        log.info("Student record is created in SQL table");
        entityManager.getTransaction().commit();
    }
}
