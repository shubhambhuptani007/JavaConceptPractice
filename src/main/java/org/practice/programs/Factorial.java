package org.practice.programs;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int fact = 1;
        for(int i=number;i>=1;i--){
            fact = fact*i;
        }
//        System.out.println(fact);
        Factorial factorial = new Factorial();
        System.out.println(factorial.facWithRecurssion(5));
    }
    int fact(int num){
        int fact = 1;
        while(num>=1){
            fact = fact*num;
            num-=1;
        }
        return fact;
    }
    int facWithRecurssion(int n){
        if(n==1){
            return 1;
        }
        return (n*facWithRecurssion(n-1));
    }
}
