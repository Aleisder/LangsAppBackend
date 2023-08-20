package ru.tsarenko.langs.service;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import ru.tsarenko.langs.dto.SyllabusDTO;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.exception.NoDataException;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.repository.SyllabusDao;
import ru.tsarenko.langs.util.SyllabusMapperDTO;

@Service
@AllArgsConstructor
public class SyllabusService {

    private final SyllabusDao syllabusDao;
    private final SyllabusMapperDTO syllabusMapperDTO;

    public SyllabusDTO getSyllabus(String learningLanguage) {
        Language lang = Language.convert(learningLanguage);
        return syllabusDao
                .getSyllabus(lang)
                .map(syllabusMapperDTO)
                .orElseThrow(NoClassDefFoundError::new);
    }

    public Lesson getLesson(String learningLanguage, String id) {
        ObjectId objectId = new ObjectId(id);
        Language lang = Language.convert(learningLanguage);
        return syllabusDao
                .getLesson(lang, objectId)
                .orElseThrow(() -> new NoDataException("ds"));
    }

}
