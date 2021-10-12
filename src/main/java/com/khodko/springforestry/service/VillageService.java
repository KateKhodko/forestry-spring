package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.Village;
import com.khodko.springforestry.repository.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageService {

    private final VillageRepository villageRepository;

    @Autowired
    public VillageService(VillageRepository villageRepository) {
        this.villageRepository = villageRepository;
    }


    public List<Village> findAll() {
        return (List<Village>) villageRepository.findAll();
    }
}
