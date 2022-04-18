package com.cloud.consumer.clients;


import com.cloud.consumer.clients.impl.ProviderClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(value = "cloud-nacos-provider",fallback = ProviderClientImpl.class)
public interface ProviderClient {
    @GetMapping("/provider/{userId}")
    Map<String ,Object> getList(@PathVariable("userId") Integer userId); //@RequestParam(value = "name")
}
