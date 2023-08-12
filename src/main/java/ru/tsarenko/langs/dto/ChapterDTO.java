package ru.tsarenko.langs.dto;

public record ChapterDTO(
        String title,
        String description,
        String[] lessons
) {
}
