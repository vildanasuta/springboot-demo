package com.example.demo.helloworld.controller;
import com.example.demo.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloWorldControllerID {
    @Autowired
    private final TranslationService translationService;
    public HelloWorldControllerID(TranslationService translationService) {
        this.translationService = translationService;
    }
    @GetMapping("/translate")
    public String translate(@RequestParam(name = "language", defaultValue = "en") String language,
                            @RequestParam(name = "originalMessage", defaultValue = "Hello World") String originalMessage) {

        return translationService.getTranslation(language, originalMessage);
    }

}
