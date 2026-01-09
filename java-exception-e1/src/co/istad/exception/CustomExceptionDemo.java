package co.istad.exception;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = Double.parseDouble(scanner.nextLine());

        try {
            validateScore(score);
            System.out.println("Valid score: " + score);
        } catch (ScoreFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void validateScore(Double score)
            throws ScoreFormatException {

        if (score < 0 || score > 100)
            throw new ScoreFormatException("Invalid score..!");
    }
}
