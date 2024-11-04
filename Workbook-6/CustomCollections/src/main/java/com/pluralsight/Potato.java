package com.pluralsight.collection;

public class Potato {
    private String name;
    private String type; // kinds of potatoes, just as an example of items in a list

    public Potato(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
