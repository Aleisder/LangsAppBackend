package ru.tsarenko.langs.repository;

import com.mongodb.client.MongoDatabase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
        var query = new Query(Criteria.where("language").is(learningLanguage.getValue()));
        var syllabus = mongoTemplate.findOne(
                query,
                Syllabus.class,
                SYLLABUS
        );
        return Optional.ofNullable(syllabus) ;
    }

    @Override
    public Lesson getLesson(Language learningLanguage, String id) {
        return null;
    }

}
