package com.cloud.cloudgatewayprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayProvider {
    @GetMapping("/gateway/provider")
    public String gatewayProvider(){
        return "i am port: 20888";
    }
}
