package com.foodwaste.service;

import com.foodwaste.model.FoodDonation;
import com.foodwaste.repository.FoodDonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodDonationService {

    @Autowired
    private FoodDonationRepository repo;

    // Donor submits food
    public FoodDonation saveFood(FoodDonation food) {
        return repo.save(food);
    }

    // Receiver / Donor fetches food list
    public List<FoodDonation> getAllFood() {
        return repo.findAll();
    }

    // 🆕 Receiver confirms pickup
    public FoodDonation markAsPickedUp(Long id) {
        FoodDonation food = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Food donation not found"));

        food.setStatus("PICKED_UP");
        return repo.save(food);
    }
}
