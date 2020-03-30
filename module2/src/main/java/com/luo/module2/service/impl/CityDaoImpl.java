package com.luo.module2.service.impl;

import com.luo.module2.service.CityDao;
import org.springframework.stereotype.Service;

@Service
public class CityDaoImpl implements CityDao {
    public static String cityName = "shiyan";

    @Override
    public String sayCityName() {
        return cityName;
    }
}
