package com.ecommerce.cjss.Ecommerce.exceptions;

public class OrderNotFoundException extends RuntimeException{

    public OrderNotFoundException(String message) {
        super(message);
    }
}
