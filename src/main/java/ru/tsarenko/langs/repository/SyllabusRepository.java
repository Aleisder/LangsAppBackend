package ru.tsarenko.langs.repository;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ru.tsarenko.langs.enums.Language;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.model.Syllabus;

import java.util.Optional;

import static ru.tsarenko.langs.enums.CollectionName.SYLLABUS;

@Repository
@AllArgsConstructor
public class SyllabusRepository implements SyllabusDao {

    private final MongoTemplate mongoTemplate;

    @Override
    public Optional<Syllabus> getSyllabus(Language learningLanguage) {
        var syllabus = mongoTemplate.findOne(
                Query.query(Criteria.where("language").is(learningLanguage.getValue())),
                Syllabus.class,
                SYLLABUS
        );
        return Optional.ofNullable(syllabus);
    }

    @Override
    public Optional<Lesson> getLesson(Language learningLanguage, ObjectId id) {
        var lesson = mongoTemplate.findOne(
                Query.query(Criteria.where("_id").is(id)),
                Lesson.class,
                learningLanguage.getValue()
        );
        return Optional.ofNullable(lesson);
    }

}
