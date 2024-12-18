package com.rbe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "offer_availed")
@Entity
@Data
@NoArgsConstructor
public class OfferAvailed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "discount_type", nullable = false)
    DiscountType discountType;
    @Column(nullable = false)
    String title;
    @Column(nullable = false)
    Double value;
    @Column(nullable = false, name = "start_date")
    LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    LocalDateTime endDate = LocalDateTime.of(2050,1,1,0,0);
    @Column(name = "is_active", nullable = false)
    Boolean isActive;
}


enum DiscountType {
    PERCENT, CURRENCY
}