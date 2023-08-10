package ru.tsarenko.langs.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarenko.langs.model.Syllabus;
import ru.tsarenko.langs.service.SyllabusService;

@RestController
@AllArgsConstructor
public class SyllabusController {

    private final SyllabusService service;

    @GetMapping("/syllabus")
    public Syllabus getSyllabus(@RequestParam("lang") String lang) {
        return service.getSyllabus(lang);
    }

    @GetMapping("/test")
    public String getTest() {
        return service.test();
    }

}
