package com.foodwaste.repository;

import com.foodwaste.model.FoodDonation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDonationRepository
        extends JpaRepository<FoodDonation, Long> {
}
