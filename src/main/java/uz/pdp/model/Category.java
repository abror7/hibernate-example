package uz.pdp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;


    private boolean isActive;




}
