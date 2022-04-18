package com.cloud.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("cloud-nacos-consumer")
public interface ConsumerClient {
    @GetMapping("/consumer/{id}")
    String getList(@PathVariable("id") Integer id);
}
