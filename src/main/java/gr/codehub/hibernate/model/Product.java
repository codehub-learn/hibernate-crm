package gr.codehub.hibernate.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;
    private double price;
    private int inventoryQuantity;

    @OneToMany(mappedBy = "product")
    private List<CartProduct> cartProductList;
}
