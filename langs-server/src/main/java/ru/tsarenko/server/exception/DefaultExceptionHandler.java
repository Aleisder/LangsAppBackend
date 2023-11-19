package ru.tsarenko.server.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(UnknownLanguageCode.class)
    public ResponseEntity<?> handleNotFoundException(RuntimeException e, HttpServletRequest request) {

        var errorBody = new ErrorBody(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                e.getMessage(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(errorBody, HttpStatus.NOT_FOUND);
    }

}
