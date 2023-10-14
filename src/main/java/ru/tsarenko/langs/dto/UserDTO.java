package ru.tsarenko.langs.dto;

import java.time.LocalDate;

public record UserDTO(
        String name,
        String email,
        LocalDate dateOfBirth,
        String avatarId
) {
}
