package com.ThreelineTest.RestApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CardExceptionController {

    @ExceptionHandler(value = InvalidRequestException.class)
    public ResponseEntity<Object> exception(InvalidRequestException exception) {
        return new ResponseEntity<>("Invalid Message Request", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = InvalidAuthorizationException.class)
    public ResponseEntity<Object> exception(InvalidAuthorizationException exception) {
        return new ResponseEntity<>("Invalid Authorization Key", HttpStatus.NOT_FOUND);
    }
}
