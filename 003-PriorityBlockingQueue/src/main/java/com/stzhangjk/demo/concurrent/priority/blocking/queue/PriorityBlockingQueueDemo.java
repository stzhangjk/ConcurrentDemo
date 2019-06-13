package com.stzhangjk.demo.concurrent.priority.blocking.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args){
        /*PriorityBlockingQueue*/
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(4);
        System.out.println(queue.peek());  //小的优先

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());  //迭代器取得无序
        }

        Object[] arr = queue.toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));      //sort后才有序

    }
}
