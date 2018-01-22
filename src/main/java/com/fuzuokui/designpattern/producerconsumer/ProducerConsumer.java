package com.fuzuokui.designpattern.producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {

    static BlockingQueue queue = new LinkedBlockingQueue<Integer>(100);

    static class Producer implements Runnable{

        @Override
        public void run() {
            try {
                Random random = new Random();
                int i = random.nextInt(20);
                System.out.println("生产数据：" + i);
                queue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable{

        @Override
        public void run() {
            try {
                System.out.println("消费数据：" + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread p1 = new Thread(new Producer());
        Thread p2 = new Thread(new Producer());
        Thread p3 = new Thread(new Producer());
        p1.start();
        p2.start();
        p3.start();
        Thread c1 = new Thread(new Consumer());
        Thread c2 = new Thread(new Consumer());
        Thread c3 = new Thread(new Consumer());
        c1.start();
        c2.start();
        c3.start();

    }
}
