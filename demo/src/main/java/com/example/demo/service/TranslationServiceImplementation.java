package com.example.demo.service;

import com.example.demo.data.Translation;
import com.example.demo.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationServiceImplementation implements TranslationService {
    private final TranslationRepository translationRepository;
    @Autowired
    public TranslationServiceImplementation(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }

    @Override
    public String getTranslation(String languageName, String originalMessage) {
        Translation translation=translationRepository.findByLanguageNameAndOriginalMessage(languageName,originalMessage);
        if(translation!=null){
            return translation.getTranslatedMessage();
        }
        else
            return originalMessage;
    }
}
