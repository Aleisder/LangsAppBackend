package ru.tsarenko.server.service;

import ru.tsarenko.server.dto.SyllabusDTO;
import ru.tsarenko.server.model.Lesson;

public interface SyllabusService {
    SyllabusDTO getSyllabus(String learningLanguage);
    Lesson getLesson(String learningLanguage, String id);
}
