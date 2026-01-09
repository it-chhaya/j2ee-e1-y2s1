package co.istad.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckedExceptionDemo2 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("src/co/istad/exception/data");
             BufferedReader br = new BufferedReader(fr)) {

            br.lines().forEach(line -> System.out.println("Data = " + line));

        } catch (FileNotFoundException e) {
            System.out.println("Read data from file failed: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }

    }
}
