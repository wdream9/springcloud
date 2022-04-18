package com.cloud.consumer.clients.impl;

import com.cloud.consumer.clients.ProviderClient;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProviderClientImpl implements ProviderClient {
    @Override
    public Map<String, Object> getList(Integer userId) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(null,null);
        return map;
    }
}
