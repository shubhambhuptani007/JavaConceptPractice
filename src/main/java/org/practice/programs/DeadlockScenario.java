package org.practice.programs;

public class DeadlockScenario {
    String a = "String a";
    String b = "String b";

    public void method1() throws InterruptedException {
        synchronized (a) {
            System.out.println("Method 1 locked a");
            Thread.sleep(1000);

            synchronized (b) {
                System.out.println("Method 1 locked b");
            }
        }
    }
    public void method2() throws InterruptedException {
        synchronized (b) {
            System.out.println("Method 2 locked b");
            Thread.sleep(1000);

            synchronized (a) {
                System.out.println("Method 2 locked a");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        DeadlockScenario lock = new DeadlockScenario();
        new Thread(()-> {
            try {
                lock.method1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()->{
            try {
                lock.method2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
