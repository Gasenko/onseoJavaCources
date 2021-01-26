package com.course.onseo.thread;

public class Mythread extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("Hello from " + Thread.currentThread().getName()+" thread");
    }
}
