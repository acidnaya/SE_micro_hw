package org.example;

public class Reader extends Operator {
    public Reader(Buffer b) {
        super(b);
    }

    @Override
    public void run() {
        int k = 0;
        while (k < 20) {
            if (buffer.getCounter() > 0) {
                System.out.println("Reader got number : " + buffer.data.poll());
                buffer.manageCounter(-1);
                ++k;
            }
        }
    }
}
