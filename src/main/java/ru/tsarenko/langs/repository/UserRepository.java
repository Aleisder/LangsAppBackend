package ru.tsarenko.langs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tsarenko.langs.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
