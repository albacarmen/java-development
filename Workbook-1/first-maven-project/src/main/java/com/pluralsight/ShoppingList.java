package com.pluralsight;

public class ShoppingList {
    public static void main(String[] args) {
        // Shopping List
        String[] items = {
                "Split Peas",
                "Eggs",
                "Bread",
                "Spinach",
                "Chicken Stock",
                "Carrots",
                "Onions",
                "Rice",
                "Chicken",
                "Pasta"
        };

        System.out.println("Items to shop:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}

