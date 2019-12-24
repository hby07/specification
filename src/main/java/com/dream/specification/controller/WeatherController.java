package com.dream.specification.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @RequestMapping("/city")
    public Map getCity(){
        Map map = new HashMap();
        map.put("code","0");
        map.put("msg","success");
        return map;
    }


}
