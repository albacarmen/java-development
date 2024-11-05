public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor to initialize Person object
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Optionally, override toString() for easy printing
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}

