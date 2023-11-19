package ru.tsarenko.server.dto;

public record SyllabusDTO(
        String language,
        ChapterDTO[] chapters
) {
}
