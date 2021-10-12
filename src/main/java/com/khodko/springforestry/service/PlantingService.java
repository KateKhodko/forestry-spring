package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.Planting;
import com.khodko.springforestry.entity.Village;
import com.khodko.springforestry.repository.PlantingRepository;
import com.khodko.springforestry.repository.VillageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlantingService {

    private PlantingRepository plantingRepository;

    public List<Planting> findAll() {
        return (List<Planting>) plantingRepository.findAll();
    }
}
