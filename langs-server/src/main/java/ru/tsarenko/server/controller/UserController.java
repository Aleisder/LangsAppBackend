package ru.tsarenko.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tsarenko.server.model.SignUpBody;
import ru.tsarenko.server.model.Syllabus;
import ru.tsarenko.server.model.User;
import ru.tsarenko.server.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/langs/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public Syllabus signUp(@RequestBody SignUpBody signUpBody) {
        return userService.createUser(signUpBody);
    }

    @DeleteMapping()
    public void deleteAccount(@RequestParam("id") Integer id) {
        userService.deleteUser(id);
    }

    @PostMapping("/edit")
    public Integer editAccount(@RequestBody User user) {
        return userService.editUser(user);
    }

}
