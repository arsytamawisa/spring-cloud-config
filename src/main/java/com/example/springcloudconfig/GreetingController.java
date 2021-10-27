package com.example.springcloudconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${app.greeting}")
    private String appGreeting;

    @Value("${app.desc}")
    private String appDesc;

    @GetMapping("/greeting")
    public String greeting() {
        return appGreeting + ", " + appDesc;
    }

}
