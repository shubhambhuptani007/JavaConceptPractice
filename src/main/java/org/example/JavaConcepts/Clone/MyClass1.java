package org.example.JavaConcepts.Clone;

public class MyClass1 {
    public static void main(String[] args) {
        Class1 someClass = new Class1();
        someClass.number="1234";
        someClass.name="Shubham";
        Class1 anotherClass = someClass.clone();
        System.out.println(someClass.number);
        anotherClass.number="11";
        System.out.println(someClass.number);
    }
}
class Class1 implements Cloneable{
    String number;
    String name;

    public Class1 clone(){
        Class1 class1 = new Class1();
        class1.number = this.number;
        class1.name = this.name;
        return class1;
    }
}
