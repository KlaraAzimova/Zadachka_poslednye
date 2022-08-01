package org.example.klara.dao;

import org.example.klara.model.Course;
import org.example.klara.model.Instructor;
import org.example.klara.util.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


public class CourseDaoImpl implements CourseDao {
    private EntityManagerFactory manager = Util.createEntityManagerFactory();

    @Override
    public void saveCourse(Course course) {
        EntityManager entityManager = manager.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Course getCourseById(Long courseId) {
        EntityManager entityManager = manager.createEntityManager();
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        EntityManager entityManager = manager.createEntityManager();
        entityManager.getTransaction().begin();
        List<Course> courses = entityManager.createQuery("SELECT c FROM Course c ORDER BY c.createAt ASC", Course.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return courses;

    }

    @Override
    public String updateCourse(Long courseId) {
        EntityManager entityManager = manager.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(courseId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    @Override
    public void deleteCourseById(Long courseId) {
        EntityManager entityManager = manager.createEntityManager();
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        for (Instructor i : course.getInstructors()) {
            i.setCourses(null);
        }
        entityManager.remove(course);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Course getCourseByName(String courseName) {
        EntityManager entityManager = manager.createEntityManager();
        entityManager.getTransaction().begin();
        Course corse = entityManager
                .createQuery("select c from Course c where c.name = :cName", Course.class)
                .setParameter("cName", courseName).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return corse;
    }
}
