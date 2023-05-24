package org.JavaConcepts.Concurrency.BlockingQueue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue {
    Queue queue;
    ReentrantLock lock;
    int capacity;
    Condition isFull;
    Condition isEmpty;

    BlockingQueue(Queue queue, ReentrantLock lock, int capacity){
        this.queue = queue;
        this.lock = lock;
        this.capacity = capacity;
        this.isEmpty = lock.newCondition();
        this.isFull = lock.newCondition();
    }
    void add(int data) throws InterruptedException {
        lock.lock();
        while(queue.size()==capacity){
            isFull.await();
        }
        queue.add(data);
        System.out.println("added = "+data);
        isEmpty.signalAll();
        lock.unlock();
    }

    void remove() throws InterruptedException {
        lock.lock();
        while(queue.size()==0){
            isEmpty.await();
        }
        System.out.println("Removed = "+queue.poll());
        isFull.signalAll();
        lock.unlock();
    }
    public static void main(String[] args) {
        int capacity = 10;
        ReentrantLock lock = new ReentrantLock();
        Queue queue = new LinkedList();
        BlockingQueue blockingQueue = new BlockingQueue(queue,lock,capacity);
        new Thread(()->{
            while(true){
                try {
                    blockingQueue.add(new Random().nextInt(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                try {
                    blockingQueue.remove();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
