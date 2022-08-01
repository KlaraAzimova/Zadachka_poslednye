package org.example.klara.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "task_name")
    private String taskName;
    @Column(name = "local_date")
    private LocalDate dedline;
    private String task;


    public Task(String taskName, int dedline, String task) {
        this.taskName = taskName;
        this.dedline = LocalDate.ofEpochDay(dedline);
        this.task = task;
    }

    @Override
    public String toString() {
        return "Task:" +
                "id=" + id +
                ", taskName=" + taskName +
                ", dedline=" + dedline +
                ", task=" + task;

    }
}
