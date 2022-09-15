package com.prog.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"product\"")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    private String description;

    private String image;

    private LocalDate sortie;

    @NotBlank(message = "Price is mandatory")
    private double price;

    @Min(message = "Quantity is at least zero", value = 0)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
