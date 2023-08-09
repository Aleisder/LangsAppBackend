package ru.tsarenko.langs.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private Integer id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private String avatarId;
    private String password;
}
