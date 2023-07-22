package org.example.factory;

public class CoffeeFactory {
    public Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            default:
                throw new IllegalArgumentException("Неверный тип кофе");
        }
        return coffee;
    }
}
