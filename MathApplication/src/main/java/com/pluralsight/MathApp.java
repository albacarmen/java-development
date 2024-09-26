package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: Compare salaries
        int bobSalary = 95000;
        int garySalary = 62000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2: Compare car and truck prices
        float carPrice = 12483.99f;
        float truckPrice = 19099.99f;
        float lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        // Question 3: Area of a circle
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);

        // Question 4: Square root of a number
        float a = 5.0f;
        double squareRoot = Math.sqrt(a);
        System.out.println("The square root of " + a + " is " + squareRoot);

        // Question 5: Distance between two points
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

        // Question 6: Absolute value
        float negativeNumber = -3.8f;
        float absoluteValue = Math.abs(negativeNumber);
        System.out.println("The absolute value of " + negativeNumber + " is " + absoluteValue);

        // Question 7: Random number
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is " + randomNumber);
    }
}
