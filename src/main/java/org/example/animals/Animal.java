package org.example.animals;

public class Animal {
    private String name;
    private boolean isDog;

    //constructor with all parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;

    }
    //constructor with one parameter
    public Animal(String name) {
        this.name = name;
        this.isDog = false; //by default
    }
    //default constructor
    public Animal() {
        this.name = "unknown";
        this.isDog = false;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for boolean id dog
    public boolean isDog() {
        return isDog;
    }

    // toString method to provide string representation of the object
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }

}

