package co.istad.exception;

import java.time.LocalDateTime;

public record Payload(
        String data,
        String message,
        LocalDateTime timestamp,
        Boolean status
) {
}
