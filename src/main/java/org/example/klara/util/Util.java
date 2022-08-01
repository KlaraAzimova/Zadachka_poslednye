package org.example.klara.util;

import org.example.klara.model.Course;
import org.example.klara.model.Instructor;
import org.example.klara.model.Lesson;
import org.example.klara.model.Task;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;

public class Util {
    public static EntityManagerFactory createEntityManagerFactory() {
        // write entity manager configuration if you want use entity manager factory
        // if you don't use this method then don't remove!
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER, "org.postgresql.Driver");
        properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.setProperty(Environment.USER, "postgres");
        properties.setProperty(Environment.PASS, "1234");
        properties.setProperty(Environment.HBM2DDL_AUTO, "create");
        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();

        configuration.addProperties(properties);

        configuration.addAnnotatedClass(Instructor.class);

        configuration.addAnnotatedClass(Course.class);

        configuration.addAnnotatedClass(Lesson.class);

        configuration.addAnnotatedClass(Task.class);

        return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
    }

}