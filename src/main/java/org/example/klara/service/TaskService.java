package org.example.klara.service;

import org.example.klara.model.Task;

import java.util.List;

public interface TaskService {
    void saveTask(Task task);

    String updateTask(Long taskId);

    List<Task> getAllTaskByLessonId();

    String deleteTaskById(Long taskId);
}
