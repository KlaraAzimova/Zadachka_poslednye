package org.example.klara.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instructors")
@Getter
@Setter
@NoArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private int phoneNumber;
    @ManyToMany(cascade = {CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
//    @JoinTable(name = "instructor_course",
//            joinColumns = @JoinColumn(name = "instructor_id"),
//            inverseJoinColumns = @JoinColumn(name = "course_id"))
    List<Course> courses;

    public Instructor(String firstName, String lastName, String email, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Instructor:" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                ", courses=" + courses;

    }
}
