package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.ForestType;
import com.khodko.springforestry.repository.ForestTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ForestTypeService {

    private ForestTypeRepository forestTypeRepository;

    public List<ForestType> findAll() {
        return (List<ForestType>) forestTypeRepository.findAll();
    }
}
