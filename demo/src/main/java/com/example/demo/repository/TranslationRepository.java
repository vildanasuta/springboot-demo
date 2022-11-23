package com.example.demo.repository;

import com.example.demo.data.Translation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationRepository extends JpaRepository<Translation, Integer> {
    Translation findByLanguageAndOriginalMessage(String language, String originalMessage);
}
