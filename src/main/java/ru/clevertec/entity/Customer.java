package ru.clevertec.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customer", schema = "servlet")
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "discount_card_id")
    private DiscountCard discountCard;
}
