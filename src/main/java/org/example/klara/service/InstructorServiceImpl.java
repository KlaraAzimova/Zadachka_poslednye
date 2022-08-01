package org.example.klara.service;

import org.example.klara.dao.InstructorDao;
import org.example.klara.dao.InstructorDaoImpl;
import org.example.klara.model.Instructor;
import org.hibernate.HibernateException;

public class InstructorServiceImpl implements InstructorService{

    InstructorDao instructorDao = new InstructorDaoImpl();
    @Override
    public void saveInstructor(Instructor instructor) {
        try {
            throw new HibernateException("dfgf");
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String updateInstructor(Long instructorId) {
        return null;
    }

    @Override
    public Instructor getInstructorById(Long instructorId) {
        return null;
    }

    @Override
    public Instructor getInstructorByCourseId(Long courseId) {
        return null;
    }

    @Override
    public void deleteInstructorById(Long instructorId) {

    }

    @Override
    public String assignInstructorToCourse(Long instructorId, Long courseId) {
        return null;
    }
}
