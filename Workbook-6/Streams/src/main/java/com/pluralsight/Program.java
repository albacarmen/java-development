import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        boolean found = false;
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(name) || person.getLastName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + person.getFirstName() + " " + person.getLastName() + " (Age: " + person.getAge() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No person was found, try again.");
        }
        myScanner.close();
    }

    private static double calculateAverageAge(List<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return people.isEmpty() ? 0 : (double) totalAge / people.size();
    }

    private static int findOldestPerson(List<Person> people) {
        if (people.isEmpty()) {
            return -1;
        }
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    private static int findYoungestPerson(List<Person> people) {
        if (people.isEmpty()) {
            return -1;
        }
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }
}
