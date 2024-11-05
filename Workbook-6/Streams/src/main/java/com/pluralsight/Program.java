package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.OptionalDouble;

public class Program {
    public static void main(String[] args) {
        List<Person> people = listOfPeople();
        searchPersonByName(people);
        double averageAge = averageAgeOfPeople(people);
        System.out.println("Average Age of People: " + averageAge);
    }

    public static List<Person> listOfPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kwame", "Mensah", 32));
        people.add(new Person("Amina", "Oladipo", 27));
        people.add(new Person("Jabari", "Makena", 35));
        people.add(new Person("Fatimah", "Diallo", 29));
        people.add(new Person("Abdul", "Kone", 40));
        people.add(new Person("Zuri", "Tshabalala", 26));
        people.add(new Person("Nia", "Okafor", 22));
        people.add(new Person("Sadio", "Diouf", 34));
        people.add(new Person("Chike", "Nwankwo", 28));
        people.add(new Person("Makena", "Njoroge", 31));

        return people;
    }

    public static void searchPersonByName(List<Person> people) {
        System.out.println("Search a person by first or last name:");
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Please enter first or last name: ");
        String name = Scanner.nextLine();

        people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(name) || person.getLastName().equalsIgnoreCase(name))
                .forEach(person -> System.out.println("Found: " + person.getFirstName() + " " + person.getLastName() + ", Age: " + person.getAge()));

        Scanner.close();
    }

    public static double averageAgeOfPeople(List<Person> people) {
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();

        return average.isPresent() ? average.getAsDouble() : 0;
    }
}
