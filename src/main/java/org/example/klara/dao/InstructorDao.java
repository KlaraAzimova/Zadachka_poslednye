package org.example.klara.dao;

import org.example.klara.model.Instructor;

public interface InstructorDao {
    void saveInstructor(Instructor instructor);

    void updateInstructor(Long instructorId,Instructor instructor);

    Instructor getInstructorById(Long instructorId);

    Instructor getInstructorByCourseId(Long courseId);

    void deleteInstructorById(Long instructorId);

    void assignInstructorToCourse(Long instructorId, Long courseId);
}
