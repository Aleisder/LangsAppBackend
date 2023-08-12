package ru.tsarenko.langs.model;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document
public class Chapter {
    private String title;
    private String description;
    private String[] lessons;
}
