package org.example.klara.dao;

import org.example.klara.model.Task;
import org.example.klara.util.Util;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class TaskDaoImpl implements TaskDao {
    static EntityManager manager = Util.createEntityManagerFactory().createEntityManager();

    @Override
    public void saveTask(Task task) {

        manager.getTransaction().begin();
        manager.persist(task);
        manager.getTransaction().commit();
        manager.close();

    }

    @Override
    public String updateTask(String name, LocalDate dedline, String task) {
        manager.getTransaction().begin();
        Task task1 = new Task();
        task1.setTaskName(name);
        task1.setDedline(dedline);
        task1.setTask(task);
        manager.getTransaction().commit();
        manager.close();
        return null;
    }

    @Override
    public List<Task> getAllTaskByLessonId() {
        manager.getTransaction().begin();
        List<Task> allTask = manager.createQuery("select t from Task t", Task.class).getResultList();
        manager.getTransaction().commit();
        manager.close();
        return allTask;


    }

    @Override
    public String deleteTaskById(Long taskId) {
        manager.getTransaction().begin();
        manager.createQuery("delete from tasks where id = 1");
        manager.getTransaction().commit();
        manager.close();
        return null;


    }
}
