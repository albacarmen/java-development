package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Testing Room
        Room room1 = new Room(2, 139.00, false, false);
        System.out.println("Room available: " + room1.isAvailable());

        // Testing Reservation
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation.getReservationTotal());

        // Testing Employee
        Employee employee = new Employee(1, "John Doe", "Management", 20.00, 45);
        System.out.println("Total pay: $" + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
    }
}
