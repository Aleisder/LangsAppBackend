package ru.tsarenko.langs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.tsarenko.langs.model.unit.Unit;

@Document
@Getter
@AllArgsConstructor
public class Lesson {
    @BsonId
    private ObjectId id;
    private String title;
    private Unit[] units;
}
