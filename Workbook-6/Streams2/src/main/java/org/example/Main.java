package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        List<Person> matchingPeople =
                people.stream()
                        .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName))
                        .collect(Collectors.toList());

        System.out.println("People with matching name:");
        matchingPeople.forEach(person ->
                System.out.println(person.getFirstName() + " " + person.getLastName())
        );

        double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kwame", "Mensah", 28));
        people.add(new Person("Amina", "Suleiman", 35));
        people.add(new Person("Chinonso", "Okafor", 42));
        people.add(new Person("Olumide", "Adeyemi", 25));
        people.add(new Person("Zainab", "Jibril", 31));
        people.add(new Person("Tariq", "Muhammad", 29));
        people.add(new Person("Fatima", "Ahmed", 33));
        people.add(new Person("Nia", "Bakari", 27));
        people.add(new Person("Abdi", "Mohammed", 36));
        people.add(new Person("Sade", "Ogunleye", 30));

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0); 
    }

    private static int findOldestAge(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findYoungestAge(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(Integer.MAX_VALUE);
    }
}
