package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder addressBuilder = new StringBuilder();

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        addressBuilder.append(fullName).append("\n");

        addressBuilder.append("Billing Address:\n");
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        addressBuilder.append(billingStreet).append("\n");

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();
        addressBuilder.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        addressBuilder.append("Shipping Address:\n");
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        addressBuilder.append(shippingStreet).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        addressBuilder.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        System.out.println("\nCustomer Information:");
        System.out.println(addressBuilder.toString());

        scanner.close();
    }
}



