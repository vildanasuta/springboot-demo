package com.example.demo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-rest")
        public String HelloWorld(){
            return "Hello World";
        }
}
