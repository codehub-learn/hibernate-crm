package gr.codehub.hibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private double balance;

    @OneToMany(mappedBy ="customer")
    private List<Cart> carts;

}
