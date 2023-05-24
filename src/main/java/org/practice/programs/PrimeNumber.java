package org.practice.programs;

public class PrimeNumber {
    static boolean isPrime(int number){
        boolean isPrime = false;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                 isPrime = true;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        if(isPrime(10)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
    }
}
