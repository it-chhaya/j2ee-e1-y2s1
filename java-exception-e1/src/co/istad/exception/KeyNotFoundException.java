package co.istad.exception;

// Customize exception with map
public class KeyNotFoundException extends RuntimeException {
    public KeyNotFoundException() {
        super();
    }

    public KeyNotFoundException(String message) {
        super(message);
    }
}
