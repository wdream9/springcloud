package com.cloud.feign.clients;

import org.springframework.stereotype.Component;

@Component
public class ProviderClientServiceIm implements ProviderClientService {
    @Override
    public String getProviderInfo() {
        return "sorry feign hystrix!";
    }
}
