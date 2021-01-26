package com.course.onseo;

import com.course.onseo.thread.Mythread;

public class Lessons21012021 {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread = new Mythread();
        mythread.start();
        Thread.sleep(10);
        System.out.println("Start! run=) ");
    }
}
