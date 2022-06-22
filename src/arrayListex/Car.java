package arrayListex;

import java.util.ArrayList;

//Q1
// Create an ArrayList of Integers
// Fill each of the 10 slots with a random value from 1-50.
// Display those values on the screen, and then prompt the user for an integer.
// Search through the ArrayList, and if the item is present, print a message that the number is in the list.
// If the value is not in the ArrayList, print a message that the number is not in the list

// Q2
// Create an ArrayList of Integers
// Fill the ArrayList with ten random numbers (1-50)
// Copy each value from the ArrayList into another ArrayList of the same capacity
// Change the last value in the first (original) ArrayList to a -5
// Display the contents of both ArrayLists

// Q3
// Make a record to store information about a car. It should contain fields for: - make (String) - model (String) - year (int)
// Create an ArrayList of Car objects.
// Sort the ArrayList of cars by year (Ascending) and print them out.

public class Car {

    private String brand;
    private String model;
    private int year;

    public Car() {
        brand = "Ferrari";
        model = "F50";
        year = 2010;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [Brand: " + brand + ", Model: " + model + ", Year: " + year + "]";
    }

    
}