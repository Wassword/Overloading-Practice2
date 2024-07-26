package org.example.animals;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    //class with main method to create list of animals

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Using overloaded constructors

        System.out.println("Welcome to Animal Zoo ");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.println("Enter name of the animal");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Is it a Dog? Yes/No");
            String isDogInput = sc.nextLine().toLowerCase();
            boolean isDog = isDogInput.equals("yes");

            animals.add(new Animal(name, isDog)); //New keyword creates instance of Animal class
            animals.add(new Animal("Fufu"));
            animals.add(new Animal());
        }
        //using for each loop tp print each Animal object using toString method
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        sc.close();
    }


}



