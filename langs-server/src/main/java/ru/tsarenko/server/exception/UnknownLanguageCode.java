package ru.tsarenko.server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UnknownLanguageCode extends RuntimeException {
    public UnknownLanguageCode(String message) {
        super(message);
    }
}
