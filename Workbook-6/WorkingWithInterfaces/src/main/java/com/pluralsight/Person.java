package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class implements Comparable <Person> {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other){
        int lastNameComparison = this.lastName.compareTo(other)
        }
}