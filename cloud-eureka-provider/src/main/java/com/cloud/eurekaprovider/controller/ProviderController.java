package com.cloud.eurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping("/eureka")
    public String EurekaClient(){
        return "eureka provider port : 8881";
    }
}
