package com.cloud.cloudgatewayconsumer.controller;

import com.cloud.cloudgatewayconsumer.clients.GatewayProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateConsumer {
    @Autowired
    private GatewayProviderClient gatewayProvider;

    @GetMapping("/gateway/consumer")
    public String gatewayConsumer(){
        return "i am port: 20889";
    }

    @GetMapping("/gateway/sentinel/consumer")
    public String sentinelConsumer(){
        String providerRes = gatewayProvider.getProviderRes();
        return "i am port: 20889 ; 20888 response: " + providerRes;
    }
}
