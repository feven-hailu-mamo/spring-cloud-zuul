package com.spring.cloud.zuul.springcloudservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudServiceTwoApplication {

    @GetMapping("/service-two")
    public String getMicroserviceTwo() {
        return "Microservice two called...";
    }

    @GetMapping("/welcome/{name}")
    public String wish(@PathVariable String name) {
        return "Hi "+name+" Welcome to Microservice two";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceTwoApplication.class, args);
    }

}
