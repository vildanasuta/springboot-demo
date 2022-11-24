package com.example.demo.helloworld.controller;
import com.example.demo.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/translate")
@RestController
public class HelloWorldControllerID {
    private final TranslationService translationService;
    @Autowired
    public HelloWorldControllerID(TranslationService translationService) {
        this.translationService = translationService;
    }
    @GetMapping
    public String translate(@RequestParam(name = "languageName", defaultValue = "English") String languageName,
                            @RequestParam(name = "originalMessage", defaultValue = "Hello World") String originalMessage) {
        return translationService.getTranslation(languageName, originalMessage);
    }

}
