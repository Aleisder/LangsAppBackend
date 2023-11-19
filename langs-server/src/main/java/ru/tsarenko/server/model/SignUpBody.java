package ru.tsarenko.server.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class SignUpBody {
    private String name;
    private String email;
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Language language;

    @Enumerated(EnumType.STRING)
    private List<Interest> interests;
}
