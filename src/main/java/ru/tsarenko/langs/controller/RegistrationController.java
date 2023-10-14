package ru.tsarenko.langs.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarenko.langs.model.SignUpBody;
import ru.tsarenko.langs.model.Syllabus;
import ru.tsarenko.langs.service.RegistrationService;

@RestController
@AllArgsConstructor
@RequestMapping("/langs/user")
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/signup")
    public Syllabus signUp(@RequestBody SignUpBody signUpBody) {
        return registrationService.signUp(signUpBody);
    }

}
