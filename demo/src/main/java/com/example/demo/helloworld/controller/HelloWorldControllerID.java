/*package com.example.demo.helloworld.controller;

import com.example.demo.model.Hello;
import com.example.demo.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloWorldControllerID {
    @Autowired
    HelloRepository helloRepository;
    @GetMapping("/hello/{id}")
    @ResponseBody
    public String helloID(@PathVariable("id") Integer id) {
        Hello hello= helloRepository.findById(id).get();
        return hello.word;
    }

}
*/