package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    private String fullName;

    @ManyToOne()
    private Group group;


    public Student(String fullName, Group group) {
        this.fullName = fullName;
        this.group = group;
    }
}
