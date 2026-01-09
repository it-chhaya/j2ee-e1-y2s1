package co.istad.thread;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        Thread t3 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        t3.start();
    }
}
