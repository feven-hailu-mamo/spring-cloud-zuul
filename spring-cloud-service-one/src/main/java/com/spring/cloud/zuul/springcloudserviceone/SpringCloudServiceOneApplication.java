package com.spring.cloud.zuul.springcloudserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudServiceOneApplication {

    @GetMapping("/service-one")
    public String getMicroserviceOne() {
        return "Microservice one called...";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceOneApplication.class, args);
    }

}
