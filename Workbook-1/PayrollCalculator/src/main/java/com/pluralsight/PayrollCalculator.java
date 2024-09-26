package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        double grossPay = calculateGrossPay(hoursWorked, payRate);

        printPaySlip(name, grossPay);

        scanner.close();
    }

    private static double calculateGrossPay(double hours, double rate) {
        return hours * rate;
    }

    private static void printPaySlip(String name, double grossPay) {
        System.out.println("\n--- Pay Slip ---");
        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.println("-----------------");
    }
}


