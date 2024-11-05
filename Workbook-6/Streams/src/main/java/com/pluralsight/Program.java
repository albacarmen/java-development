import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> people = listOfPeople();
        searchPerson(people);
        System.out.println("Average age of people: " + calculateAverageAge(people));
        System.out.println("Oldest person's age: " + findOldestPerson(people));
        System.out.println("Youngest person's age: " + findYoungestPerson(people));
    }

    public static List<Person> listOfPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kofi", "Mensah", 28));
        people.add(new Person("Amina", "Suleiman", 35));
        people.add(new Person("Chinonso", "Okafor", 42));
        people.add(new Person("Kwame", "Asante", 25));
        people.add(new Person("Zainab", "Jibril", 31));
        people.add(new Person("Tariq", "Muhammad", 29));
        people.add(new Person("Fatima", "Ahmed", 33));
        people.add(new Person("Olumide", "Adeyemi", 27));
        people.add(new Person("Nia", "Bakari", 30));
        people.add(new Person("Abdi", "Mohammed", 36));
        return people;
    }

    public static void searchPerson(List<Person> people) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Search for a person by first or last name:");
        System.out.print("Please enter first or last name: ");
        String name = myScanner.nextLine();

        List<Person> matchingPeople = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(name) || person.getLastName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (!matchingPeople.isEmpty()) {
            matchingPeople.forEach(person -> System.out.println("Found: " + person.getFirstName() + " " + person.getLastName() + " (Age: " + person.getAge() + ")"));
        } else {
            System.out.println("No person found with that name.");
        }

        myScanner.close();
    }

    private static double calculateAverageAge(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    private static int findOldestPerson(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(Integer.MIN_VALUE); // Returns Integer.MIN_VALUE if the list is empty
    }

    private static int findYoungestPerson(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(Integer.MAX_VALUE); // Returns Integer.MAX_VALUE if the list is empty
    }
}

