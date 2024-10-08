package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation = null;

        do {

            System.out.print("Enter a mathematical expression (example: 1 + 1): ");
            String input = scanner.nextLine();


            double firstNumber = 0;
            double secondNumber = 0;
            String operator = "";


            int operatorIndex = findOperatorIndex(input);

            if (operatorIndex != -1) {

                String firstPart = input.substring(0, operatorIndex).trim();
                firstNumber = Double.parseDouble(firstPart);


                operator = String.valueOf(input.charAt(operatorIndex)).trim();


                String secondPart = input.substring(operatorIndex + 1).trim();
                secondNumber = Double.parseDouble(secondPart);
            } else {
                System.out.println("No valid operator found.");
                continue; // Skip to the next iteration
            }


            double result;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.printf("%.2f + %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    System.out.printf("%.2f - %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    System.out.printf("%.2f * %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;

                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                        System.out.printf("%.2f / %.2f = %.2f%n", firstNumber, secondNumber, result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator: " + operator);
                    break;
            }


            System.out.print("Do you want to calculate again? (yes/no): ");
            continueCalculation = scanner.nextLine().trim().toLowerCase();
        } while (continueCalculation.equals("yes"));


        scanner.close();
        System.out.println("Thank you for using Carmy's calculator!");
    }


    private static int findOperatorIndex(String input) {
        char[] operators = {'+', '-', '*', '/'};
        for (int i = 0; i < input.length(); i++) {
            for (char operator : operators) {
                if (input.charAt(i) == operator) {
                    return i;
                }
            }
        }
        return -1;
    }
}

