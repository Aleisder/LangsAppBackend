package ru.tsarenko.server.repository;

import org.bson.types.ObjectId;
import ru.tsarenko.server.enums.Language;
import ru.tsarenko.server.model.Lesson;
import ru.tsarenko.server.model.Syllabus;

import java.util.Optional;

public interface SyllabusRepository {
    Optional<Syllabus> getSyllabus(Language learningLanguage);
    Optional<Lesson> getLesson(Language learningLanguage, ObjectId id);
}
