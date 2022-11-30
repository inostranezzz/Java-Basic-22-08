package org.example.homework.Throwable;

public class OverLoadEmploeeException extends Exception {
    public OverLoadEmploeeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
