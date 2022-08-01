package org.example.klara.exception;

public class AlreadyExistsExseption extends RuntimeException{
    public AlreadyExistsExseption() {
    }

    public AlreadyExistsExseption(String message) {
        super(message);
    }
}
