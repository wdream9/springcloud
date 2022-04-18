package com.cloud.consumer.controller;

import com.cloud.consumer.clients.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    private static final Logger LOG = Logger.getLogger(ConsumerController.class.getName());

    @GetMapping("/consumer/{id}")
    public String con(@PathVariable int id){
        LOG.log(Level.INFO, "info consumer called");
        Map<String, Object> list = providerClient.getList(id);
        return "server port: 6667  map: " + list.toString();
    }

    @Value("${username:lily}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        LOG.log(Level.INFO, "info username called");
        return username;
    }
}
