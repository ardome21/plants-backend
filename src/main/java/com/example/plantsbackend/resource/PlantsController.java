package com.example.plantsbackend.resource;

import com.example.plantsbackend.delegate.PlantDelegator;
import com.example.plantsbackend.resource.api.PlantRO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plants")
public class PlantsController {

    private final PlantDelegator plantDelegator = new PlantDelegator();

    @GetMapping()
    public PlantRO getPlant(){
        PlantRO plantRO = plantDelegator.getExamplePlant();
        return plantRO;
    }
}
