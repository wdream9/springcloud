package com.cloud.feign.controller;


import com.cloud.feign.clients.ProviderClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private ProviderClientService providerClientService;

    @GetMapping("/feign")
    String feign(){
        String providerInfo = providerClientService.getProviderInfo();
        return "feign consumer providerInfo ：" +  providerInfo;
    }

}
