package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> futuramaCharacters = new ArrayList<>();
        futuramaCharacters.add(new Character("Philip J. Fry", "Human", 25));
        futuramaCharacters.add(new Character("Turanga Leela", "Mutant", 30));
        futuramaCharacters.add(new Character("Bender Bending Rodríguez", "Robot", 4));
        futuramaCharacters.add(new Character("Professor Hubert Farnsworth", "Human", 160));
        futuramaCharacters.add(new Character("Dr. John Zoidberg", "Decapodian", 40));
        futuramaCharacters.add(new Character("Amy Wong", "Human", 22));
        futuramaCharacters.add(new Character("Hermes Conrad", "Human", 43));
        futuramaCharacters.add(new Character("Nibbler", "Nibbler", 1000));

        Collections.sort(futuramaCharacters);

        for (Character character : futuramaCharacters) {
            System.out.println(character);
        }
    }
}

