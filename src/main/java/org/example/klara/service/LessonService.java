package org.example.klara.service;

import org.example.klara.model.Course;
import org.example.klara.model.Lesson;

public interface LessonService {
    void saveLesson(Lesson lesson);

    void updateLesson(Long lessonId);

    Lesson getLessonById(Long lessonId);

    String getLessonByCourseId(Course courseId);
}
