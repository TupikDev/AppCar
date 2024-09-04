package org.example;

import org.example.entity.Fuel;

public class AppCar {
    public static void main(String[] args) {
        int p = Fuel.PETROL_92.getPrice();
        System.out.println(p);
    }
}