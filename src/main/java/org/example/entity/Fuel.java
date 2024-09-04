package org.example.entity;

public enum Fuel {
    PETROL_92(50);

    private final int price;

    Fuel(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
