package org.example.klara.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courseGen")
    @SequenceGenerator(name = "courseGen", allocationSize = 1)
    private Long id;
    private String name;
    private byte duration;
    private LocalDate createAt;
    @Column(name = "image_link")
    private String imageLink;
    private String description;
    @ManyToMany(cascade = {DETACH, MERGE, PERSIST, REFRESH},fetch = FetchType.LAZY)
    List<Instructor> instructors;

    @OneToMany( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    List<Lesson> lessons;

    public Course(String courseName, byte duration, int createAt, String imageLink, String description) {
        this.name = courseName;
        this.duration = duration;
        this.createAt = LocalDate.ofEpochDay(createAt);
        this.imageLink = imageLink;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course:" +
                "id=" + id +
                ", courseName=" + name +
                ", duration=" + duration +
                ", createAt=" + createAt +
                ", imageLink=" + imageLink +
                ", description=" + description +
                ", instructors=" + instructors +
                ", lessons=" + lessons;

    }
}
