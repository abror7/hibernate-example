package uz.pdp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teachers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    @Id
    @GeneratedValue
    private Integer id;

    private String fullName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "teachers_students", joinColumns = {@JoinColumn(name = "teacher_id")}, inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", fullName='" + fullName + '\'' + '}';
    }
//........

}
