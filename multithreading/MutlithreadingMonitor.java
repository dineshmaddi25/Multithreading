package multithreading;

// this code is without synchronization

class mydata {
    public void display(String str) { // synchronized 
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}

class mythread1 extends Thread {
    mydata d;

    public mythread1(mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello Guys");
    }
}

class mythread2 extends Thread {
    mydata d;

    public mythread2(mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("welcome");
    }
}

class test {
    public static void main(String args[]) {
        mydata d = new mydata();
        mythread1 t1 = new mythread1(d);
        mythread2 t2 = new mythread2(d);
        t1.start();
        t2.start();
    }
}
