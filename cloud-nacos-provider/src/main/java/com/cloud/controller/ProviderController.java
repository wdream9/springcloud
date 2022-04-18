package com.cloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ProviderController {
    private static final Logger LOG = Logger.getLogger(ProviderController.class.getName());

    @GetMapping("/provider/{userId}")
    public Map<String,Object> provider(@PathVariable Integer userId){
        LOG.log(Level.INFO, "hi provider called");
        HashMap<String, Object> map = new HashMap<>();
        map.put(userId.toString(), "adsfasdf");
        return map;
    }
}
