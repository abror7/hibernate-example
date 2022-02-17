package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "groups")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Group {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

//    @OneToMany(mappedBy = "group")
//    private List<Student> students;


    public Group(String name, List<Student> students) {
        this.name = name;
//        this.students = students;
    }
}


