package ru.tsarenko.langs.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.model.Syllabus;
import ru.tsarenko.langs.repository.SyllabusDao;

@Service
@AllArgsConstructor
public class SyllabusService {

    private final SyllabusDao syllabusDao;

    public Syllabus getSyllabus(String learningLanguage) {
        Language lang = Language.convert(learningLanguage);
        return syllabusDao.getSyllabus(lang);
    }

    public Lesson getLesson(String learningLanguage, String id) {
        return null;
    }

    public String test() {
        return "Test";
    }

}
