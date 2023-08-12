package ru.tsarenko.langs.util;

import org.springframework.stereotype.Component;
import ru.tsarenko.langs.dto.ChapterDTO;
import ru.tsarenko.langs.model.Chapter;

import java.util.function.Function;

@Component
public class ChapterMapperDTO implements Function<Chapter, ChapterDTO> {
    @Override
    public ChapterDTO apply(Chapter chapter) {
        return new ChapterDTO(
                chapter.getTitle(),
                chapter.getDescription(),
                chapter.getLessons()
        );
    }
}
