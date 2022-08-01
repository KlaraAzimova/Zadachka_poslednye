package org.example.klara.dao;

import org.example.klara.model.Course;
import org.example.klara.model.Lesson;

import java.util.List;

public interface LessonDao {
    void saveLesson(Lesson lesson);

    void updateLesson(Long lessonId);

    Lesson getLessonById(Long lessonId);

    List<Lesson> getLessonByCourseId(Course courseId);
}
