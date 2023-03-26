package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        var buffer = new Buffer();
        var reader = new Reader(buffer);
        var writer = new Writer(buffer);
        Operator.start(reader);
        Operator.start(writer);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Did not sleep...");
        }
//        Operator.stop(reader);
//        Operator.stop(writer);
    }
}