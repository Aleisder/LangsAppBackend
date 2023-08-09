package ru.tsarenko.langs.repository;

import com.mongodb.client.MongoDatabase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.model.Syllabus;

@Repository
@AllArgsConstructor
public class SyllabusRepository implements SyllabusDao {

    private final MongoDatabase mongoDatabase;

    @Override
    public Syllabus getSyllabus(Language learningLanguage) {
        return null;
    }

    @Override
    public Lesson getLesson(Language learningLanguage, String id) {
        return null;
    }

}
