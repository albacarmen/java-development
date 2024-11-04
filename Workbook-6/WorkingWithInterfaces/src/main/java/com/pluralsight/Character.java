package com.pluralsight;

public class Character implements Comparable<Character> {
    private String fullName;
    private String species;
    private int age;

    public Character(String fullName, String species, int age) {
        this.fullName = fullName;
        this.species = species;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Character otherCharacter) {
        int nameComparison = this.fullName.compareTo(otherCharacter.fullName);

        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(this.age, otherCharacter.age);
    }

    @Override
    public String toString() {
        return fullName + " (" + species + "), Age: " + age;
    }
}

