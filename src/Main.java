import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import arrayListex.Car;


public class Main {

    public static void main(String[] args) throws Exception {

    //Q3
    
    Car car1 = new Car("Fiat", "Punto", 2014);
    Car car2 = new Car("Ford", "Mustang", 2022);
    Car car3 = new Car("Toyota", "Supra", 2004);
    Car car4 = new Car("Nissan", "GTR", 2016);
    Car car5 = new Car("Honda", "Civic", 2018);
    Car car6 = new Car("Volswagen", "Golf", 2012);
    Car car7 = new Car("Toyota", "Highlander", 2021);
    Car car8 = new Car("GMC", "Denali", 2022);
    Car car9 = new Car("Dodge", "Charger", 1970);
    Car car10 = new Car("BMW", "M6", 2020);

    ArrayList<Car> carr = new ArrayList<Car>();

    carr.add(car1);
    carr.add(car2);
    carr.add(car3);
    carr.add(car4);
    carr.add(car5);
    carr.add(car6);
    carr.add(car7);
    carr.add(car8);
    carr.add(car9);
    carr.add(car10);

    carr.forEach(System.out::println);
    System.out.println("#------------------------------------------------------#");


    Collections.sort(carr, Comparator.comparing(Car::getYear));
    carr.forEach(System.out::println);
   


    }
}
