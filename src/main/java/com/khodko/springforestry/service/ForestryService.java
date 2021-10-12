package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.Forestry;
import com.khodko.springforestry.repository.ForestryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ForestryService {

    private ForestryRepository forestryRepository;

    public List<Forestry> findAll() {
        return (List<Forestry>) forestryRepository.findAll();
    }
}
