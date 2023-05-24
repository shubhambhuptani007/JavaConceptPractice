package org.JavaConcepts.String;

public class Example2 {
    public static void main(String[] args) {
        String s ="Hello World";
        System.out.println(s.substring(0,5));
        StringBuffer str = new StringBuffer("Hello");
        System.out.println("str = "+str);
        str.append(" World");
    }
}
