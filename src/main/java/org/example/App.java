package org.example;

import org.example.klara.dao.InstructorDao;
import org.example.klara.dao.InstructorDaoImpl;
import org.example.klara.model.Course;
import org.example.klara.model.Instructor;
import org.example.klara.service.CourseService;
import org.example.klara.service.CourseServiceImpl;
import org.example.klara.service.TaskService;
import org.example.klara.service.TaskServiceImpl;
import org.example.klara.util.Util;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Util.createEntityManagerFactory();
//        TaskService taskService = new TaskServiceImpl();
//        taskService.saveTask(new Task("Aziza",2022-1-2,"while"));
//        taskService.updateTask();
//        System.out.println(taskService.getAllTaskByLessonId());
        CourseService courseService = new CourseServiceImpl();
//        System.out.println(courseService.saveCourse(new Course("Java", (byte) 9, 2022 - 2 - 2, "https://peaksoft.talentlms.com/unit/view/id:5755", "Hibernate")));
//        System.out.println(courseService.saveCourse(new Course("Java Script", (byte) 6, 2022 - 1 - 2, "https://learn.javascript.ru/while-for", "While")));
      //  System.out.println(courseService.getCourseById(7L));
        InstructorDao instructorDao = new InstructorDaoImpl();
//        instructorDao.saveInstructor(new Instructor("sdf","sldkfj","sldf",2343));
//        instructorDao.updateInstructor(1L, new Instructor("Nurbekov", "fkjdf", "dfkjd", 232));

    }
}
