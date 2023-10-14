package ru.tsarenko.langs.service;

import ru.tsarenko.langs.model.SignUpBody;
import ru.tsarenko.langs.model.Syllabus;

public interface RegistrationService {
    Syllabus signUp(SignUpBody signUpBody);
}
