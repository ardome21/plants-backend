package com.example.plantsbackend.delegate;

import com.example.plantsbackend.delegate.mappers.PlantDelegateMapper;
import com.example.plantsbackend.model.Plant;
import com.example.plantsbackend.resource.api.PlantRO;
import com.example.plantsbackend.service.PlantService;

public class PlantDelegator {

    private final PlantService plantService = new PlantService();

    public PlantRO getExamplePlant() {
        Plant plant = plantService.getExamplePlant();
        PlantRO plantRO = PlantDelegateMapper.mapToPlantRO(plant);
        return plantRO;
    }
}
