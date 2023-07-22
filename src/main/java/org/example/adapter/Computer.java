package org.example.adapter;

public class Computer {
    public void connect(USB usb) {
        usb.set();
        System.out.println("Устройство обнаружено компьютером");
    }
}
