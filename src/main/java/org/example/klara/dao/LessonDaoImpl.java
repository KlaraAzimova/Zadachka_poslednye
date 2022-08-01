package org.example.klara.dao;

import org.example.klara.model.Course;
import org.example.klara.model.Lesson;
import org.example.klara.util.Util;


import javax.persistence.EntityManager;
import java.util.List;

public class LessonDaoImpl implements LessonDao {
    static EntityManager entityManager = Util.createEntityManagerFactory().createEntityManager();

    @Override
    public void saveLesson(Lesson lesson) {
        entityManager.getTransaction().begin();
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void updateLesson(Long lessonId) {
        entityManager.getTransaction().begin();
        entityManager.merge(lessonId);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public Lesson getLessonById(Long lessonId) {
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class,lessonId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson;
    }

    @Override
    public List<Lesson> getLessonByCourseId(Course courseId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class,courseId);
        List<Lesson> lessonList = course.getLessons();
        entityManager.getTransaction().commit();
        entityManager.close();

        return lessonList;
    }
}
