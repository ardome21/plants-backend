package com.example.plantsbackend.service.mappers;

import com.example.plantsbackend.model.Plant;
import com.example.plantsbackend.repository.api.PlantDO;

public interface PlantServiceMapper {
    static Plant mapToPlant(PlantDO plantDO) {
        Plant plant = new Plant();
        plant.setName(plantDO.getName());
        return plant;
    }
}
