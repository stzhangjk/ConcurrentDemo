package com.stzhangjk.demo.concurrent;

public class Task implements Runnable {

    private int index;

    public Task(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", index=" + index);
    }
}
