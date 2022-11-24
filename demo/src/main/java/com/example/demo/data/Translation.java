package com.example.demo.data;

import javax.persistence.*;

@Entity(name = "translation")
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "languageName")
    private String languageName;
    @Column(name = "original_message")
    private String originalMessage;
    @Column(name = "translated_message")
    private String translatedMessage;
    public Translation() {
    }

    public Translation(Integer id, String languageName, String originalMessage, String translatedMessage) {
        this.id = id;
        this.languageName = languageName;
        this.originalMessage = originalMessage;
        this.translatedMessage = translatedMessage;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "id=" + id +
                ", language='" + languageName + '\'' +
                ", originalMessage='" + originalMessage + '\'' +
                ", translatedMessage='" + translatedMessage + '\'' +
                '}';
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getOriginalMessage() {
        return originalMessage;
    }

    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    public String getTranslatedMessage() {
        return translatedMessage;
    }

    public void setTranslatedMessage(String translatedMessage) {
        this.translatedMessage = translatedMessage;
    }
}