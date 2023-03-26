package org.example;

public class Operator implements Runnable {

    Buffer buffer;
    private Thread workingThread;

    public Operator(Buffer b) {
        buffer = b;
    }

    public synchronized static void start(Operator operator) {
        operator.workingThread = new Thread(operator);
        operator.workingThread.start();
    }

    public synchronized static void stop(Operator operator) {
        operator.workingThread.interrupt();
    }
    @Override
    public void run() {
    }
}
