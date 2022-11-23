package com.example.demo.helloworld.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllerID {

    @RequestMapping("/translate")
    public String translate(@RequestParam(name = "language", defaultValue = "en") String language,
                            @RequestParam(name = "originalMessage", defaultValue = "Hello World") String originalMessage) {
        return "translate";
    }

}
