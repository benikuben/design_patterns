package org.example.factory;

public class Americano extends Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Готовим американо...");
    }
}
