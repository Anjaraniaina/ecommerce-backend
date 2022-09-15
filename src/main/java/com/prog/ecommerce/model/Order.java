package com.prog.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"order\"")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "order_date")
    private Instant orderDate;

    //Table de jointure (Order_Product)
    @ManyToMany
    private List<Product> productList;

    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payement;

    @Getter
    @AllArgsConstructor
    @EqualsAndHashCode
    @ToString
    public static class RegistrationRequest {
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String password;
    }
}
