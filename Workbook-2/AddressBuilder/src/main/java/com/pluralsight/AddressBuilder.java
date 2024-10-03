package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder addressBuilder = new StringBuilder();

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        addressBuilder.append(fullName).append("\n");

        appendAddress(scanner, addressBuilder, "Billing");
        appendAddress(scanner, addressBuilder, "Shipping");

        System.out.println("\nCustomer Information:");
        System.out.println(addressBuilder);

        scanner.close();
    }

    private static void appendAddress(Scanner scanner, StringBuilder addressBuilder, String type) {
        addressBuilder.append(type).append(" Address:\n");
        System.out.print(type + " Street: ");
        addressBuilder.append(scanner.nextLine()).append("\n");

        System.out.print(type + " City: ");
        String city = scanner.nextLine();

        System.out.print(type + " State: ");
        String state = scanner.nextLine();

        System.out.print(type + " Zip: ");
        String zip = scanner.nextLine();
        addressBuilder.append(city).append(", ").append(state).append(" ").append(zip).append("\n");
    }
}




