package com.foodwaste.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "food_donation")
public class FoodDonation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "donor_name")
    private String donorName;

    @Column(name = "food_type")
    private String foodType;

    private int quantity;
    private String location;

    @Column(name = "expiry_time")
    private String expiryTime;

    // ✅ REQUIRED by JPA
    public FoodDonation() {}

    // ✅ Getters & Setters (VERY IMPORTANT)

}
