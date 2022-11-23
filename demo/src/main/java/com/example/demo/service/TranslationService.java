package com.example.demo.service;

import com.example.demo.data.Translation;

import java.util.Optional;

public interface TranslationService {
    String getTranslation(String language, String originalMessage);
    void addTranslation(Translation translation);
    Optional<Translation> findById(int id);


}
