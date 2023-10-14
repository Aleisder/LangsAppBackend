package ru.tsarenko.langs.service.implementation;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import ru.tsarenko.langs.dto.SyllabusDTO;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.exception.NoDataException;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.model.Syllabus;
import ru.tsarenko.langs.repository.SyllabusDao;
import ru.tsarenko.langs.service.SyllabusService;
import ru.tsarenko.langs.util.SyllabusMapperDTO;

@Service
@AllArgsConstructor
public class SyllabusServiceImpl implements SyllabusService {

    private final SyllabusDao syllabusDao;
    private final SyllabusMapperDTO syllabusMapperDTO;

    @Override
    public SyllabusDTO getSyllabus(String learningLanguage) {
        Language lang = Language.convert(learningLanguage);
        return syllabusDao
                .getSyllabus(lang)
                .map(Syllabus::toDTO)
                .orElseThrow(NoClassDefFoundError::new);
    }

    @Override
    public Lesson getLesson(String learningLanguage, String id) {
        ObjectId objectId = new ObjectId(id);
        Language lang = Language.convert(learningLanguage);
        return syllabusDao
                .getLesson(lang, objectId)
                .orElseThrow(() -> new NoDataException("ds"));
    }

}
