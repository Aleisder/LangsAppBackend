package ru.tsarenko.langs.service;

import ru.tsarenko.langs.dto.SyllabusDTO;
import ru.tsarenko.langs.model.Lesson;

public interface SyllabusService {
    SyllabusDTO getSyllabus(String learningLanguage);
    Lesson getLesson(String learningLanguage, String id);
}
