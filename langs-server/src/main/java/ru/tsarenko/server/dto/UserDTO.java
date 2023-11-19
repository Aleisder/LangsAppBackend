package ru.tsarenko.server.dto;

import java.time.LocalDate;

public record UserDTO(
        String name,
        String email,
        LocalDate dateOfBirth,
        String avatarId
) {
}
