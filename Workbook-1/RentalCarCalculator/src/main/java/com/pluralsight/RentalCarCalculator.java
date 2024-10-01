package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pickup date (e.g., YYYY-MM-DD): ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of days for the rental: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Do you want an electronic toll tag at $3.95/day? (yes/no): ");
        boolean tollTag = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want a GPS at $2.95/day? (yes/no): ");
        boolean gps = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want roadside assistance at $3.95/day? (yes/no): ");
        boolean roadsideAssistance = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double basicRentalCost = calculateBasicRentalCost(rentalDays, age);
        double optionsCost = calculateOptionsCost(rentalDays, tollTag, gps, roadsideAssistance);
        double totalCost = basicRentalCost + optionsCost;

        System.out.printf("Pickup Date: %s%n", pickupDate);
        System.out.printf("Basic Car Rental Cost: $%.2f%n", basicRentalCost);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        if (age < 25) {
            double under25Surcharge = basicRentalCost * 0.30;
            System.out.printf("Underage Driver Surcharge: $%.2f%n", under25Surcharge);
            totalCost += under25Surcharge;
        }
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        scanner.close();
    }

    private static double calculateBasicRentalCost(int days, int age) {
        double dailyRate = 29.99;
        double totalCost = dailyRate * days;
        if (age < 25) {
            totalCost += totalCost * 0.30; // 30% surcharge
        }
        return totalCost;
    }

    private static double calculateOptionsCost(int days, boolean tollTag, boolean gps, boolean roadsideAssistance) {
        double tollTagCost = tollTag ? 3.95 * days : 0;
        double gpsCost = gps ? 2.95 * days : 0;
        double roadsideCost = roadsideAssistance ? 3.95 * days : 0;
        return tollTagCost + gpsCost + roadsideCost;
    }
}
