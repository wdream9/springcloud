package com.cloud.eureka.controller;


import com.cloud.eureka.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;

    @GetMapping("/consumer")
    public String EurekaConsumer(){
        // 这种是直连，没有通过注册中心
         //String result = restTemplate.getForObject("http://localhost:8881/eureka", String.class);
        // 通过注册中心获取
        String result2 = restTemplate.getForObject("http://CLOUD-EUREKA-PROVIDER/eureka", String.class);

        return "eureka consumer RestTemplate port: 8882  response: " + result2;
    }

    // 测试熔断器
    @GetMapping("/hystrix")
    public String hystrixTest(){
        String s = helloService.hiService();
        return "hystrix test :" + s;
    }
}
