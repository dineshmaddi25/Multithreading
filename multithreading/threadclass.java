package multithreading;

import java.util.*;

public class threadclass {
    public static void main(String args[]) {
        myrun1 mr = new myrun1("MY thread 1");
        /*
         * System.out.println(mr.getId());
         * System.out.println(mr.getName());
         * System.out.println(mr.getPriority());
         * mr.start();
         * System.out.println(mr.getState());
         * System.out.println(mr.isAlive());
         */
        mr.start();
        mr.interrupt();

    }
}

class myrun1 extends Thread {
    public myrun1(String name) {
        super(name);
        // setPriority(MAX_PRIORITY);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count);
            count++;
            try {
                Thread.sleep(1000);// there will lot of delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted" + e);
            }
        }
    }
}