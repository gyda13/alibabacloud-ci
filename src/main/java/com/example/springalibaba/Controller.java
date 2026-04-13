package com.example.springalibaba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/whoami")
    public Map<String, Object> hello() {
        Map<String, Object> res = new LinkedHashMap<>();
        res.put("message", "Hey there! You found the API. 👋");
        res.put("author", "Gyda");
        res.put("stack", "Spring Boot on Alibaba Cloud ECS");
        res.put("tip", "Head to / for a proper introduction 😎");
        return res;
    }

}
