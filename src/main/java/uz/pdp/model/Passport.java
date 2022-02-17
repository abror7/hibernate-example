package uz.pdp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "passports")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Passport {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true, nullable = false)
    private String serialNumber;

    @OneToOne
    private Employee employee;
}
