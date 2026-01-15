package com.foodwaste.controller;

import com.foodwaste.model.FoodDonation;
import com.foodwaste.service.FoodDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
@CrossOrigin(origins = "*")
public class FoodDonationController {

    @Autowired
    private FoodDonationService service;

    @PostMapping("/donate")
    public FoodDonation donateFood(@RequestBody FoodDonation food) {
        return service.saveFood(food);
    }

    @GetMapping("/list")
    public List<FoodDonation> getFoodList() {
        return service.getAllFood();
    }
}

