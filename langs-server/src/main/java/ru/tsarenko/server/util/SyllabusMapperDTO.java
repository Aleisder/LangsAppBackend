package ru.tsarenko.server.util;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.tsarenko.server.dto.ChapterDTO;
import ru.tsarenko.server.dto.SyllabusDTO;
import ru.tsarenko.server.model.Syllabus;

import java.util.Arrays;
import java.util.function.Function;

@Component
@AllArgsConstructor
public class SyllabusMapperDTO implements Function<Syllabus, SyllabusDTO> {

    private final ChapterMapperDTO chapterMapperDTO;

    @Override
    public SyllabusDTO apply(Syllabus syllabus) {
        return new SyllabusDTO(
                syllabus.getLanguage(),
                Arrays.stream(syllabus.getChapters())
                        .map(chapterMapperDTO)
                        .toArray(ChapterDTO[]::new)
        );
    }

}
