package com.khodko.springforestry.controller;

import com.khodko.springforestry.entity.Village;
import com.khodko.springforestry.service.VillageService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    VillageService villageService;

    @GetMapping("/hello-world")
    public List<Village> getAllVillages() {
        return villageService.findAll();
    }
}