package ru.tsarenko.langs.dto;

public record SyllabusDTO(
        String language,
        ChapterDTO[] chapters
) {
}
