package ru.tsarenko.server.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tsarenko.server.model.SignUpBody;
import ru.tsarenko.server.model.Syllabus;
import ru.tsarenko.server.model.User;
import ru.tsarenko.server.repository.UserRepository;
import ru.tsarenko.server.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Syllabus createUser(SignUpBody signUpBody) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Integer editUser(User user) {
        return null;
    }

}
