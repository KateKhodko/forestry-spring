package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.Forester;
import com.khodko.springforestry.repository.ForesterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ForesterService {

    private ForesterRepository foresterRepository;

    public List<Forester> findAll() {
        return (List<Forester>) foresterRepository.findAll();
    }
}
