package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());

        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        scanner.close();
    }
}
