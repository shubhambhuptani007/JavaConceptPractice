package org.practice.programs;

import java.util.List;

public class CheckOddNumbers {
    static boolean checkOddNumbers(List<Integer> list){
        boolean isOdd =true;
        for(Integer i:list){
            if(i%2==0){
                isOdd = false;
            }
        }
        return isOdd;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,23,213,23,123,4,3,354,13,323,122,4);
        if(checkOddNumbers(list)){
            System.out.println("List contains odd numbers");
        }else{
            System.out.println("List contains both odd and even numbers");
        }
    }
}
