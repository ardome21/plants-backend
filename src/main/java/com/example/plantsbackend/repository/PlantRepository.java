package com.example.plantsbackend.repository;

import com.example.plantsbackend.repository.api.PlantDO;

public class PlantRepository {

    public PlantDO getExamplePlant() {
        return new PlantDO("Even After All the Changes");
    }
}
