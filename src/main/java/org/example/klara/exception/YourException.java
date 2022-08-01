package org.example.klara.exception;

public class YourException extends RuntimeException {
    public YourException() {
    }

    public YourException(String message) {
        super(message);
    }
}
