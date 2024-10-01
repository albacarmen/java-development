package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String firstName = promptUser(scanner, "First name");
        String middleName = promptUser(scanner, "Middle name (optional)");
        String lastName = promptUser(scanner, "Last name");
        String suffix = promptUser(scanner, "Suffix (optional)");

        String fullName = constructFullName(firstName, middleName, lastName, suffix);
        System.out.println("Full name: " + fullName);

        scanner.close();
    }

    private static String promptUser(Scanner scanner, String field) {
        System.out.print(field + ": ");
        return scanner.nextLine().trim();
    }

    private static String constructFullName(String first, String middle, String last, String suffix) {
        StringBuilder fullNameBuilder = new StringBuilder(first);

        if (!middle.isEmpty()) {
            fullNameBuilder.append(" ").append(middle);
        }

        fullNameBuilder.append(" ").append(last);

        if (!suffix.isEmpty()) {
            fullNameBuilder.append(", ").append(suffix);
        }

        return fullNameBuilder.toString().trim();
    }
}
