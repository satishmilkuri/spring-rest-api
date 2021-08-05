package com.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestApiController {


    @GetMapping("/sayHello")
    public String sayHello(){
        return "sayHello";
    }
}
