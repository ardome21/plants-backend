package com.example.plantsbackend.delegate.mappers;

import com.example.plantsbackend.model.Plant;
import com.example.plantsbackend.resource.api.PlantRO;

public interface PlantDelegateMapper {
    static PlantRO mapToPlantRO(Plant plant) {
        PlantRO plantRO = new PlantRO();
        plantRO.setName(plant.getName());
        return plantRO;
    }
}
