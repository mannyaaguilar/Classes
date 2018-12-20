package com.manny;

public class Main {

    public static void main(String[] args) {
        // Objects are all around us.
        // Real world objects have two major characteristics:
        // State and Behavior
        // State: Computer - Amount of RAM, OS, HD size, monitor size, etc.
        // Behavior: Computer - Booting up, shutting down, beeping, printing, drawing on screen, etc.
        // State: Dog - Age, color, conscious state (awake, sleeping, etc.)
        // Behavior: Dog - Eating, drinking, fighting, etc.
        // Software objects are a fundamental part of OOP, and
        // they are very similar to real world objects because they
        // also consist of State and Behavior
        // A software object stores its State in fields(variables)
        // and expose their Behavior with methods.
        // Think of a class as a template or blueprint for creating objects
        // What benefit do classes give us in our every day programming?
        // A class can be thought of as a powerful user-defined
        // data type (although, not correct in the true meaning),
        // but gives an idea of what classes are (regular data type on steroids!)

        Car porsche = new Car();
        // We have created an object called "porsche" based on the blueprint "Car"
        Car holden = new Car();
        // We have created an object called "holden" based on the blueprint "Car"
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
