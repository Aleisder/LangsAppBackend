package ru.tsarenko.server.dto;

public record ChapterDTO(
        String title,
        String description,
        String[] lessons
) {
}
