package com.example.demo.service;


import com.example.demo.data.Translation;
import com.example.demo.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface TranslationService {
    String getTranslation(String languageName, String originalMessage);
}
