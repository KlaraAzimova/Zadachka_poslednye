package org.example.klara.service;

import org.example.klara.model.Instructor;

public interface InstructorService {
    void saveInstructor(Instructor instructor);

    String updateInstructor(Long instructorId);

    Instructor getInstructorById(Long instructorId);

    Instructor getInstructorByCourseId(Long courseId);

    void deleteInstructorById(Long instructorId);

    String assignInstructorToCourse(Long instructorId, Long courseId);
}
