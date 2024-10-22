package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    private static int numbers;

    public static void main(String[] args) {
        String[] quotes ={
        "I'm literally angry with rage!",
        "Bite my shiny metal ass",
        "Shut Up and take my money",
        "Oh. Your. God",
        "I don't want to live in this planet anymore",
        "A headache with pictures",
        "I have to protect my children from evolution"
        };

        Scanner scanner = new Scanner(System.in);
                System.out.println("Select a number between 1 and 7");
        int number = scanner.nextInt();

        System.out.println("Futurama Quote: " + quotes[numbers-1]);
        scanner.close();
    }
}