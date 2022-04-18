package com.cloud.controller;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${username}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }
}

