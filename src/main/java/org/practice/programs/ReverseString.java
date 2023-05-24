package org.practice.programs;

public class ReverseString {
    public static void main(String[] args) {
        String someString = "Hello This is Shubham";
        String reverseString = "";
        for(int i=someString.length()-1;i>=0;i--){
            reverseString += someString.charAt(i);
        }
        System.out.println("Reversed 1 = "+reverseString);

        char stringArray[] = someString.toCharArray();
        String revString = "";
        for(int i=stringArray.length-1;i>=0;i--){
            revString+=stringArray[i];
        }
        System.out.println("Reversed 2 = "+revString);
    }
}
