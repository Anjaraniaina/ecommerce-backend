package com.prog.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"payment\"")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank(message = "Card number is mandatory")
    @Column(name = "card_number")
    private String cardNumber;

    @NotBlank(message = "Payment date is mandatory")
    @Column(name = "payment_date")
    private Instant paymentDate;

    private double amount;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
