package org.example.factory;

public class CoffeeMachine {
    public CoffeeMachine() {
    }

    public void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        turnOnCoffeeMachine();
        coffee.makeCoffee();
    }

    public void turnOnCoffeeMachine() {
        System.out.println("Включаем кофемашину...");
    }
}
