package gr.codehub.hibernate.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;
}
