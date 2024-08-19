package multithreading;

import java.util.*;

public class threadinterface {
    public static void main(String args[]) {
        Thread t = new Thread(new myrun(), "Thread 0");
        // Thread t = new Thread("Thread 0");
        // Thread t = new Thread(new myrun());
        // Thread t = new Thread(new myrun, Thread 0);
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.isAlive());

    }
}

class myrun implements Runnable {
    public void run() {
    }
}