package com.zjt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final ApplicationContext applicationContext;

    public DemoController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/getValueOfFirstInitializer")
    public String getValueOfFirstInitializer() {
        return String.format("FirstInitializer set value of key1 is %s", applicationContext.getEnvironment().getProperty("key1"));
    }

    @GetMapping("/getValueOfSecondInitializer")
    public String getValueOfSecondInitializer() {
        return String.format("SecondInitializer set value of key2 is %s", applicationContext.getEnvironment().getProperty("key2"));
    }
}
