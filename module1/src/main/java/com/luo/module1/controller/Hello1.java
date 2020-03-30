package com.luo.module1.controller;

import com.luo.module2.service.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1 {
    @Autowired(required = false)
    CityDao cityDao;

    @GetMapping("/")
    public String sayModule1() {
        return "module1";
    }

    @GetMapping("/city")
    public String sayModule11() {
        return cityDao.sayCityName();
    }
}
