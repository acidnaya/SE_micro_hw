package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Writer extends Operator {
    public Writer(Buffer b) {
        super(b);
    }

    @Override
    public void run() {
        int k = 0;
        while (k < 20) {
            if (buffer.getCounter() <= buffer.getCapacity()) {
                int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
                try {
                    buffer.data.put(randomNum);
                    System.out.println("Writer put number : " + randomNum);
                    buffer.manageCounter(+1);
                    ++k;
                } catch (InterruptedException e) {
                    System.out.println("Writer was interrupted");
                }
            }
        }
    }
}
