package ru.tsarenko.langs.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarenko.langs.dto.SyllabusDTO;
import ru.tsarenko.langs.model.Lesson;
import ru.tsarenko.langs.service.SyllabusService;

@RestController
@AllArgsConstructor
@RequestMapping("/langs")
public class SyllabusController {

    private final SyllabusService syllabusService;

    @GetMapping("/syllabus")
    public SyllabusDTO getSyllabus(@RequestParam("lang") String lang) {
        return syllabusService.getSyllabus(lang);
    }

    @GetMapping("/lesson")
    public Lesson getLesson(
            @RequestParam("lang") String lang,
            @RequestParam("id") String id
    ) {
        return syllabusService.getLesson(lang, id);
    }

}
