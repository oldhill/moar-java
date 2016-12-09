package multi.util;

import java.lang.Thread;

public class PrintThread extends Thread {

    private int toPrint;

    public PrintThread(int toPrint) {
        this.toPrint = toPrint;
    }

    public void run() {
        // hi
        System.out.println("Hi: " + this.toPrint);
    }
}
