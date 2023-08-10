package ru.tsarenko.langs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Builder
@Document
public class Syllabus {

    @BsonProperty("_id")
    @BsonId
    private ObjectId id;

    @BsonProperty("language")
    private String language;

    private Chapter[] chapters;

}
