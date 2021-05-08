package gr.codehub.hibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private Date orderDate;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "cart")
    private List<CartProduct> cartProductList;


}
