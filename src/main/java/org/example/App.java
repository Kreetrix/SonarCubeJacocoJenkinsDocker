package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers to display in the loop? ");

        int count;
        try {
            count = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Using default value 5.");
            count = 5;
        }

        printNumbers(count);
    }


    public static void printNumbers(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("i = " + i);
        }
    }

    public static String generateNumbersOutput(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            sb.append("i = ").append(i);
            if (i < count) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
