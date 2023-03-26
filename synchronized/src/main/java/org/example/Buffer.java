package org.example;

import java.util.concurrent.LinkedBlockingQueue;

public class Buffer {
    private volatile int counter = 0;
    private final int capacity = 10;
    public LinkedBlockingQueue<Integer> data = new LinkedBlockingQueue<>();

    public synchronized void manageCounter(int i) {
        counter += i;
    }

    public int getCounter() {
        return counter;
    }

    public int getCapacity() {
        return capacity;
    }
}
