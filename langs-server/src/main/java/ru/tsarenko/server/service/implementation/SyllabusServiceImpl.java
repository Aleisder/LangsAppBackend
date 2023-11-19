package ru.tsarenko.server.service.implementation;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import ru.tsarenko.server.dto.SyllabusDTO;
import ru.tsarenko.server.enums.Language;
import ru.tsarenko.server.exception.NoDataException;
import ru.tsarenko.server.model.Lesson;
import ru.tsarenko.server.model.Syllabus;
import ru.tsarenko.server.repository.SyllabusRepository;
import ru.tsarenko.server.service.SyllabusService;
import ru.tsarenko.server.util.SyllabusMapperDTO;

@Service
@AllArgsConstructor
public class SyllabusServiceImpl implements SyllabusService {

    private final SyllabusRepository syllabusRepository;
    private final SyllabusMapperDTO syllabusMapperDTO;

    @Override
    public SyllabusDTO getSyllabus(String learningLanguage) {
        Language lang = Language.convert(learningLanguage);
        return syllabusRepository
                .getSyllabus(lang)
                .map(Syllabus::toDTO)
                .orElseThrow(NoClassDefFoundError::new);
    }

    @Override
    public Lesson getLesson(String learningLanguage, String id) {
        ObjectId objectId = new ObjectId(id);
        Language lang = Language.convert(learningLanguage);
        return syllabusRepository
                .getLesson(lang, objectId)
                .orElseThrow(() -> new NoDataException("ds"));
    }

}
