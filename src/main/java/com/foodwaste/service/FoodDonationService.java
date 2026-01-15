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

    public FoodDonation saveFood(FoodDonation food) {
        return repo.save(food);
    }

    public List<FoodDonation> getAllFood() {
        return repo.findAll();
    }
}

