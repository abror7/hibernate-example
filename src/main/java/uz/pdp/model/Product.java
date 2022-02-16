package uz.pdp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "products")
public class Product {
    @Id
    private Integer id;
    private String name;
    private Double price;

    @ManyToOne
    private Category category;
}
