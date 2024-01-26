package ru.clevertec.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "discount_card", schema = "servlet")
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DiscountCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "amount")
    private Short amount;

    @OneToOne(mappedBy = "discountCard")
    private Customer customer;
}