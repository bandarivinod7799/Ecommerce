package com.ecommerce.cjss.Ecommerce.exceptions;

public class ErrorCode {

    Integer errorCode;
    String message;

    public ErrorCode(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
