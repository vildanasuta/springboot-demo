package com.example.demo;
import com.example.demo.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private TranslationRepository translationRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@PostConstruct
	private void postInit(){
		System.out.println("All translations: "+translationRepository.findAll());
	}


}
