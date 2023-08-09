package ru.tsarenko.langs.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarenko.langs.service.SyllabusService;

@RestController
@AllArgsConstructor
public class SyllabusController {

    private final SyllabusService service;

    @GetMapping("/syllabus")
    public String getSyllabus(@PathParam("lang") String lang) {
        return null;
    }

}
