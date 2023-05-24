package org.JavaConcepts.String;

public class Example1 {

    public static void main(String[] args) {
        String string = new String("Hello");
        String someString = "Hello";
        System.out.println(string==someString);
        System.out.println(string.equals(someString));
    }
}
