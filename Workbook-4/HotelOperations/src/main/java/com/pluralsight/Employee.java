package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public void punchTimeCard(double time) {
        if (startTime == 0.0) {
            // Punch in
            startTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            // Punch out
            double workedHours = time - startTime;
            if (workedHours > 0) {
                hoursWorked += workedHours;
                System.out.println(name + " punched out at " + time + ". Hours worked: " + workedHours);
            } else {
                System.out.println("Punch out time must be after punch in time.");
            }
            startTime = 0.0; // Reset start time after punching out
        }
    }
}
