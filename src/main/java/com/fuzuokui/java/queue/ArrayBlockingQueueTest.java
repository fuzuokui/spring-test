package com.fuzuokui.java.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue<Integer>(8);
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.put(4);
        queue.put(5);
        queue.put(6);
        queue.put(7);
        System.out.println(queue.offer(8));
        System.out.println(queue.offer(9));
        System.out.println(queue.offer(10, 1, TimeUnit.SECONDS));

        System.out.println(queue.take());
        System.out.println(queue.take());
        queue.put(11);
        System.out.println();

    }
}
