package ru.tsarenko.server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoDataException extends RuntimeException {
    public NoDataException(String message) {
        super(message);
    }
}
