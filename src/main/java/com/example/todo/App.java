package com.example.todo;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;

        int numDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

