package com.stzhangjk.demo.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        ExecutorService es = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 100; i++) {
            es.execute(new Task(i));
        }
        es.shutdown();
    }
}
