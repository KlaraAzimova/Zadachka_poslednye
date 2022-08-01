package org.example.klara.service;

import org.example.klara.dao.CourseDao;
import org.example.klara.dao.CourseDaoImpl;
import org.example.klara.exception.NotFoundException;
import org.example.klara.model.Course;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao = new CourseDaoImpl();

    @Override
    public String saveCourse(Course course) {
        courseDao.saveCourse(course);
        return "add course successfully!";
    }

    @Override
    public Course getCourseById(Long courseId) {
        Course course = courseDao.getCourseById(courseId);
        try {
            if (course == null) {
                throw new NotFoundException("not id");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public String updateCourse(Long courseId) {
        return courseDao.updateCourse(courseId);
    }

    @Override
    public void deleteCourseById(Long courseId) {
         courseDao.deleteCourseById(courseId);
    }

    @Override
    public Course getCourseByName(String courseName) {
        return courseDao.getCourseByName(courseName);
    }
}
