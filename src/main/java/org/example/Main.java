package org.example;

import org.example.adapter.Computer;
import org.example.adapter.MemoryCard;
import org.example.adapter.USBAdapter;
import org.example.factory.CoffeeMachine;
import org.example.factory.CoffeeType;
import org.example.proxy.DBConnectionProxy;
import org.example.singleton.Logger;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Logger logger = Logger.getInstance();
        logger.classLog(logger, "Some info");
        //Factory
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start(CoffeeType.ESPRESSO);
        //Adapter
        MemoryCard memoryCard = new MemoryCard();
        USBAdapter usbAdapter = new USBAdapter(memoryCard);
        Computer computer = new Computer();
        computer.connect(usbAdapter);
        //Proxy
        DBConnectionProxy proxy = new DBConnectionProxy("название бд");
        System.out.print("Подключено ");
        proxy.displayUrl();
    }
}