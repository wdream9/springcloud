package com.cloud.cloudgatewayconsumer.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-gateway-provider")
public interface GatewayProviderClient {

    @GetMapping("/gateway/provider")
    String getProviderRes();

}
