package ru.tsarenko.langs.model;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.tsarenko.langs.dto.ChapterDTO;

@Getter
@Document
public class Chapter {
    private String title;
    private String description;
    private String[] lessons;

    public ChapterDTO toDTO() {
        return new ChapterDTO(title, description, lessons);
    }
}
