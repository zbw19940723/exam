package com.it.test;

public class MyThread {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread1());
        t.start();
        System.out.println(Thread.currentThread());
    }


}
class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello");
    }
}