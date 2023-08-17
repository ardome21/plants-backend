package com.example.plantsbackend.service;

import com.example.plantsbackend.model.Plant;
import com.example.plantsbackend.repository.PlantRepository;
import com.example.plantsbackend.repository.api.PlantDO;
import com.example.plantsbackend.service.mappers.PlantServiceMapper;
import org.springframework.stereotype.Service;


@Service
public class PlantService {

    private final PlantRepository plantRepository = new PlantRepository();
    public Plant getExamplePlant() {
        PlantDO plantDO = plantRepository.getExamplePlant();
        return PlantServiceMapper.mapToPlant(plantDO);
    }
}
