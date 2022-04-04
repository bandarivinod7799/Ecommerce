package com.ecommerce.cjss.Ecommerce.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exceptions {

    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<ErrorCode> orderNotFoundException(OrderNotFoundException orderNotFoundException) {
        ErrorCode errorCode = new ErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value(), orderNotFoundException.getMessage());
        return new ResponseEntity<>(errorCode, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
