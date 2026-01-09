package co.istad.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            // Create path object
            Path path = Paths.get("src/co/istad/exception/data");
            // Start read file
            String data = Files.readString(path);
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Read data from file failed: "
                    + e.getMessage());
        }

    }
}
