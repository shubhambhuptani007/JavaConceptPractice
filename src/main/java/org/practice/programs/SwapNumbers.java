package org.practice.programs;

public class SwapNumbers {
    static void method1(){
        System.out.println("Method 1");
        int a = 10;
        int b = 20;
        System.out.println("Before");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
    static void method2(){
        System.out.println("Method 2");
        int a = 10;
        int b = 20;
        System.out.println("Before");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
    public static void main(String[] args) {
        method1();
        method2();
    }
}
