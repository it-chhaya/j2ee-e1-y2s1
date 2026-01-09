package co.istad.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

    private static double divide(double x, double y) {
        if (y == 0)
            throw new ArithmeticException("Y cannot be zero");
        return x / y;
    }

    private static double divide3(double x, double y, double z) throws Exception {
        if (y == 0 || z == 0)
            throw new Exception("Y cannot be zero");
        return x / y / z;
    }

    public static void main(String[] args) {

        try {
            System.out.println(divide3(10,2,0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        /*do {
            try {
                int[] numbers = {10,20,30};

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter index: ");
                int index = Integer.parseInt(scanner.nextLine());

                System.out.println("Index: " + index);
                System.out.println("Number: " + numbers[index]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid type of data: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Accessing array index wrong: " + e.getMessage());
            } finally {
                System.out.println("This is finally block");
            }
        } while (true);*/
    }
}
