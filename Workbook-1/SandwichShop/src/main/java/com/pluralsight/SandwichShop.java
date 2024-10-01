package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sandwich size
        System.out.print("Choose sandwich size (1: Regular, 2: Large): ");
        int sizeChoice = scanner.nextInt();
        double basePrice = (sizeChoice == 1) ? 5.45 : 8.95;

        // Age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        double discount = calculateDiscount(age);

        // Final price
        double finalPrice = basePrice * (1 - discount);

        // Displaying cost
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);

        scanner.close();
    }

    private static double calculateDiscount(int age) {
        if (age <= 17) {
            return 0.10; // 10% discount for students
        } else if (age >= 65) {
            return 0.20; // 20% discount for seniors
        } else {
            return 0.0; // No discount
        }
    }
}
