package com.stzhangjk.demo.concurrent;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {
    public static void main(String[] args){
        Queue queue = new PriorityBlockingQueue<Integer>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(4);
        System.out.println(queue.peek());  //小的优先

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        Object[] arr = queue.toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
