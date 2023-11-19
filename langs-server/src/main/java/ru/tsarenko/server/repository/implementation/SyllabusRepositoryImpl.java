package ru.tsarenko.server.repository.implementation;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ru.tsarenko.server.enums.Language;
import ru.tsarenko.server.model.Lesson;
import ru.tsarenko.server.model.Syllabus;
import ru.tsarenko.server.repository.SyllabusRepository;
import ru.tsarenko.server.enums.CollectionName;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class SyllabusRepositoryImpl implements SyllabusRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public Optional<Syllabus> getSyllabus(Language learningLanguage) {
        var syllabus = mongoTemplate.findOne(
                Query.query(Criteria.where("language").is(learningLanguage.getValue())),
                Syllabus.class,
                CollectionName.SYLLABUS
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
