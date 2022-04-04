package com.ecommerce.cjss.Ecommerce.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exceptions {

    @ExceptionHandler(OrderNotFoundException.class)
    public String orderNotFoundException(){


return "Order with Given ID Not Found";
    }
}
