package ru.tsarenko.langs.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tsarenko.langs.dto.SyllabusDTO;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.repository.SyllabusRepository;
import ru.tsarenko.langs.util.SyllabusMapperDTO;

@Service
@AllArgsConstructor
public class SyllabusService {

    private final SyllabusRepository syllabusDao;

    private final SyllabusMapperDTO syllabusMapperDTO;

    public SyllabusDTO getSyllabus(String learningLanguage) {
        Language lang = Language.convert(learningLanguage);
        return syllabusDao
                .getSyllabus(lang)
                .map(syllabusMapperDTO)
                .orElseThrow(NoClassDefFoundError::new);
    }

    public Lesson getLesson(String learningLanguage, String id) {
        return null;
    }

}
