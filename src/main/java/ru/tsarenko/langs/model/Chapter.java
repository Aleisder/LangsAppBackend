package ru.tsarenko.langs.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Chapter {
    private String title;
    private String description;
    private String[] lessons;

}
