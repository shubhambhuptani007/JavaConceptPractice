package org.example.JavaConcepts.Abstraction;

public class UseAbstraction extends AbstractClassExample{
    public static void main(String[] args) {
        UseAbstraction abstraction = new UseAbstraction();
        abstraction.method1();
        abstraction.method2();
        FunctionalInterface fI = ()-> System.out.println("This is a functional Interface");
        InterfaceExample interfaceExample = new InterfaceExample() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        };
    }

    @Override
    void method1() {
        System.out.println("Method 1 by object 1");
    }

    @Override
    void method2() {
        System.out.println("Method 2 by object 2");
    }
}
