package com.luo.module2.controller;

import com.luo.module2.service.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Hello2 {
    @Autowired
    CityDao city;

    @GetMapping("/hello2")
    public String sayModule2() {
        return "module2";
    }

    @GetMapping("/city2")
    public String sayModule21() {
        return city.sayCityName();
    }
}
