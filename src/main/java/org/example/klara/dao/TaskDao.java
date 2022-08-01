package org.example.klara.dao;

import org.example.klara.model.Task;

import java.time.LocalDate;
import java.util.List;

public interface TaskDao {
   void saveTask(Task task);

    String updateTask(String name, LocalDate dedline, String task);

    List<Task> getAllTaskByLessonId();

    String deleteTaskById(Long taskId);

}
