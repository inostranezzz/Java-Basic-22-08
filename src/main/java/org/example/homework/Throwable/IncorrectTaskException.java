package org.example.homework.Throwable;

public class IncorrectTaskException extends RuntimeException {
    public IncorrectTaskException(String message) {
        super(message);
    }

    public IncorrectTaskException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
