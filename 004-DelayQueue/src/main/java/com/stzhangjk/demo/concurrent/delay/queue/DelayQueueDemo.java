package com.stzhangjk.demo.concurrent.delay.queue;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueueDemo {
    public static void main(String[] args) {
        Random random = new Random();
        DelayQueue<Delayed> queue = new DelayQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.add(new TestDelayedElement(random.nextInt(1000)));
        }

        long lastTrigger = 0;

        try {
            for (int i = 0; i < 5; i++) {
                TestDelayedElement e = (TestDelayedElement) queue.take();
                System.out.println("trigger: " + e.getTrigger());
                if (i != 0){
                    System.out.println("gap: " + (e.getTrigger() - lastTrigger));
                }
                lastTrigger = e.getTrigger();
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}
