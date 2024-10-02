package com.pluralsight;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TheatreReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = prompt("Please enter your name: ", scanner);
        String dateInput = prompt("What date will you be coming (MM/dd/yyyy): ", scanner);
        int numberOfTickets = getNumberOfTickets(scanner);

        String confirmationMessage = createConfirmation(fullName, dateInput, numberOfTickets);
        System.out.println(confirmationMessage);

        scanner.close();
    }

    private static String prompt(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    private static int getNumberOfTickets(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(prompt("How many tickets would you like? ", scanner));
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number of tickets: ");
            }
        }
    }

    private static String createConfirmation(String fullName, String dateInput, int numberOfTickets) {
        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[names.length - 1];
        String formattedDate = formatShowDate(dateInput);

        String ticketWord = (numberOfTickets == 1) ? "ticket" : "tickets";
        return String.format("%d %s reserved for %s under %s, %s",
                numberOfTickets, ticketWord, formattedDate, lastName, firstName);
    }

    private static String formatShowDate(String dateInput) {
        Date showDate = parseDate(dateInput);
        return new SimpleDateFormat("yyyy-MM-dd").format(showDate);
    }

    private static Date parseDate(String dateInput) {
        try {
            return new SimpleDateFormat("MM/dd/yyyy").parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            System.exit(1);
            return null; // Unreachable, but needed for compilation
        }
    }
}
