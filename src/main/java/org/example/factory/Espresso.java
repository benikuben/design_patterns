package org.example.factory;

public class Espresso extends Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Готовим эспрессо...");
    }
}
