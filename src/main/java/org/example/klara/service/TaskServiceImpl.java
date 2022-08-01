package org.example.klara.service;


import org.example.klara.dao.TaskDao;
import org.example.klara.dao.TaskDaoImpl;
import org.example.klara.model.Task;


import java.time.LocalDate;
import java.util.List;

public class TaskServiceImpl implements TaskService {

    private TaskDao taskDao = new TaskDaoImpl();

    @Override
    public void saveTask(Task task) {
      taskDao.saveTask(task);
    }

    @Override
    public String updateTask(Long taskId) {
        return taskDao.updateTask("Hibernate", LocalDate.ofEpochDay(2022-30-07),"HomeWork");
    }

    @Override
    public List<Task> getAllTaskByLessonId() {
        return taskDao.getAllTaskByLessonId();
    }

    @Override
    public String deleteTaskById(Long taskId) {
        return taskDao.deleteTaskById(taskId);
    }
}
