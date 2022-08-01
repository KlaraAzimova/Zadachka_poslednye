package org.example.klara.dao;

import org.example.klara.model.Course;
import org.example.klara.model.Instructor;
import org.example.klara.util.Util;

import javax.persistence.EntityManager;

public class InstructorDaoImpl implements InstructorDao {
    static EntityManager manager = Util.createEntityManagerFactory().createEntityManager();

    @Override
    public void saveInstructor(Instructor instructor) {
        manager.getTransaction().begin();
        manager.persist(instructor);
        manager.getTransaction().commit();
        manager.close();

    }

    @Override
    public void updateInstructor(Long instructorId, Instructor instructor) {
        manager.getTransaction().begin();
        Instructor instructor1 = manager.find(Instructor.class, instructorId);
        instructor1.setFirstName(instructor.getFirstName());
        instructor1.setLastName(instructor.getLastName());
        instructor1.setEmail(instructor.getEmail());
        instructor1.setPhoneNumber(instructor.getPhoneNumber());
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public Instructor getInstructorById(Long instructorId) {
        manager.getTransaction().begin();
        Instructor instructor = manager.find(Instructor.class, instructorId);
        manager.getTransaction().commit();
        manager.close();
        return instructor;
    }

    @Override
    public Instructor getInstructorByCourseId(Long courseId) {
        manager.getTransaction().begin();
        Instructor instructor = manager.find(Instructor.class, courseId);
        manager.getTransaction().commit();
        manager.close();
        return instructor;
    }

    @Override
    public void deleteInstructorById(Long instructorId) {
        manager.getTransaction().begin();
        Instructor instructor = manager.find(Instructor.class, instructorId);
        manager.remove(instructor);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void assignInstructorToCourse(Long instructorId, Long courseId) {
        manager.getTransaction().begin();
        manager.createQuery("select c from instructor c.id == id").setParameter("id",instructorId);
        manager.getTransaction().commit();
        manager.close();

    }
}
