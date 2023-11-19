package ru.tsarenko.server.service;

import ru.tsarenko.server.model.SignUpBody;
import ru.tsarenko.server.model.Syllabus;
import ru.tsarenko.server.model.User;

public interface UserService {
    Syllabus createUser(SignUpBody signUpBody);
    void deleteUser(Integer id);
    Integer editUser(User user);
}
