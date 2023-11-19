package ru.tsarenko.server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.tsarenko.server.dto.ChapterDTO;
import ru.tsarenko.server.dto.SyllabusDTO;

import java.util.Arrays;

@AllArgsConstructor
@Builder
@Getter
@Document
public class Syllabus {

    @BsonProperty("_id")
    @BsonId
    private ObjectId id;

    @BsonProperty("language")
    private String language;

    private Chapter[] chapters;

    @Override
    public String toString() {
        return "Syllabus{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", chapters=" + Arrays.toString(chapters) +
                '}';
    }

    public SyllabusDTO toDTO() {
        return new SyllabusDTO(
                language,
                Arrays
                        .stream(chapters)
                        .map(Chapter::toDTO)
                        .toArray(ChapterDTO[]::new)
        );
    }


}
