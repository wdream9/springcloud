package com.cloud.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cloud-eureka-provider", fallback = ProviderClientServiceIm.class)
public interface ProviderClientService {

    @GetMapping("/eureka")
    String getProviderInfo();
}
