package org.example.JavaConcepts.Abstraction;

public interface InterfaceExample {
    void method1();
    default void defaultMethod(){
        System.out.println("This is a default method");
    }
    void method2();
}
