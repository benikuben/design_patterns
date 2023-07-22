package org.example.adapter;

public class USBAdapter implements USB {
    private final MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void set() {
        memoryCard.set();
    }
}
