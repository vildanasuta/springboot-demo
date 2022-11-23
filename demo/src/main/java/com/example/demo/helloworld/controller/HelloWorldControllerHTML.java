package com.example.demo.helloworld.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldControllerHTML {

    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String helloAsHTML() {
        return "<html>\n" + "<body>\n" + "<h1> Hello World \n</h1>" + "</body>\n" + "</html>";
    }


}
