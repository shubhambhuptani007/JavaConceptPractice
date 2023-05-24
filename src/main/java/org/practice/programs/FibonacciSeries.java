package org.practice.programs;

public class FibonacciSeries {
    static void method1(int limit){
            int a = 0;
            int b = 1;
            int i=0;
            int sum=a+b;
            System.out.print(a + " "+b+" ");
            while(i<limit){
                System.out.print(sum+" ");
                a = b;
                b = sum;
                sum = a+b;
                i++;
            }
    }
    static int withRecursion(int count){
        if(count<=1){
            return count;
        }
        return withRecursion(count-1)+withRecursion(count-2);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(withRecursion(i));
        }
    }

}
