package com.example.demo.repository;

import com.example.demo.data.Translation;
import org.springframework.data.repository.CrudRepository;

public interface TranslationRepository extends CrudRepository<Translation, Integer> {
}
