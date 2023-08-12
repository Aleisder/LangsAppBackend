package ru.tsarenko.langs.util;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.tsarenko.langs.dto.ChapterDTO;
import ru.tsarenko.langs.dto.SyllabusDTO;
import ru.tsarenko.langs.model.Syllabus;

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
