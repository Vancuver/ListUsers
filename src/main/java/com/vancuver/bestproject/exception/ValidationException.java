package com.vancuver.bestproject.exception;

public class ValidationException extends Throwable {
    private String message;

    public ValidationException(String message) {
    }

    public String getMessage() {
        return message;
    }
}


