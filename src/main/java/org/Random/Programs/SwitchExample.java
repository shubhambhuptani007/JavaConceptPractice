package org.Random.Programs;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FunctionalInterface fI1 = (value)-> System.out.println("Some method with input "+value);
        FunctionalInterface fI2 = (value)-> System.out.println("Some method with input "+value);
        FunctionalInterface fI3 = (value) -> System.out.println("Some method with input "+value);
        FunctionalInterface defaultFunction = (value)-> System.out.println("Printed with default value "+value);
        System.out.println("Please enter the input between 1,2 and 3");
        int input = sc.nextInt();
        switch (input){
            case 1:
                fI1.someMethod(input);
                break;
            case 2:
                fI2.someMethod(input);
                break;
            case 3:
                fI3.someMethod(input);
                break;
            default:
                defaultFunction.someMethod(input);
        }
    }
}
interface FunctionalInterface{
    void someMethod(int value);
}
