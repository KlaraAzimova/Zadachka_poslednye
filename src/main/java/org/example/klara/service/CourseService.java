package org.example.klara.service;

import org.example.klara.model.Course;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface CourseService {
    String saveCourse(Course course);

    Course getCourseById(Long courseId);

    List<Course> getAllCourse();

    String updateCourse(Long courseId);

    void deleteCourseById(Long courseId);

   Course getCourseByName(String courseName);

}
