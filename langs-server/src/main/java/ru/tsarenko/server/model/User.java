package ru.tsarenko.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import ru.tsarenko.server.dto.UserDTO;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private String avatarId;
    private String password;

    public UserDTO toDTO() {
        return new UserDTO(name, email, dateOfBirth, avatarId);
    }

}
