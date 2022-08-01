package org.example.klara.service;

import org.example.klara.dao.LessonDao;
import org.example.klara.dao.LessonDaoImpl;
import org.example.klara.model.Course;
import org.example.klara.model.Lesson;

public class LessonServiceImpl implements LessonService {
    LessonDao lessonDao = new LessonDaoImpl();

    @Override
    public void saveLesson(Lesson lesson) {
        lessonDao.saveLesson(lesson);

    }

    @Override
    public void updateLesson(Long lessonId) {
         lessonDao.updateLesson(lessonId);
    }

    @Override
    public Lesson getLessonById(Long lessonId) {
        return lessonDao.getLessonById(lessonId);
    }

    @Override
    public String getLessonByCourseId(Course courseId) {
        return null;
    }
}
