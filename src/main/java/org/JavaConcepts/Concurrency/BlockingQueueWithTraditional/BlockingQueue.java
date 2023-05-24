package org.JavaConcepts.Concurrency.BlockingQueueWithTraditional;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue {
    Queue queue;
    int capacity;
    BlockingQueue(Queue queue, int capacity){
        this.queue = queue;
        this.capacity = capacity;
    }

    public void add(int data) throws InterruptedException {
        synchronized (this){
            while(queue.size()==capacity){
                wait();
            }
            queue.add(data);
            System.out.println("Added = "+data);
            notifyAll();
        }
    }
    public void remove() throws InterruptedException {
        synchronized (this){
            while (queue.size()==0){
                wait();
            }
            System.out.println("Removed = "+queue.poll());
            notifyAll();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int capacity =10;
        BlockingQueue blockingQueue = new BlockingQueue(queue,capacity);
        new Thread(()->{
            try {while(true) {
                blockingQueue.add(new Random().nextInt(100));
            }} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(()->{
            try {
                while(true) {
                    blockingQueue.remove();
                    Thread.sleep(1000);
                }} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
