package ru.tsarenko.langs.repository;

import org.bson.types.ObjectId;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.model.Syllabus;

import java.util.Optional;

public interface SyllabusDao {

    Optional<Syllabus> getSyllabus(Language learningLanguage);

    Optional<Lesson> getLesson(Language learningLanguage, ObjectId id);

}
