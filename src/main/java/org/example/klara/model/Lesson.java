package org.example.klara.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@NoArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "lesson_name")
    private String lessonName;

    private String videoLink;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private Course course;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_id")
    List<Task> tasks;

    public Lesson(String lessonName, String videoLink) {
        this.lessonName = lessonName;
        this.videoLink = videoLink;
    }

    @Override
    public String toString() {
        return "Lesson:" +
                "id=" + id +
                ", lessonName=" + lessonName +
                ", videoLink=" + videoLink +
                ", tasks=" + tasks;

    }
}
