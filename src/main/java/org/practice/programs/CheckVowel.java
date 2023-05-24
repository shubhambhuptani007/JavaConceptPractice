package org.practice.programs;

public class CheckVowel {
    public static void main(String[] args) {
        String someString = "nnnnnnnnnnnnnnnnnn";
        boolean isVowel = false;
        for(int i=0;i<someString.length();i++){
            if(someString.charAt(i)=='a' || someString.charAt(i)=='e' || someString.charAt(i)=='i'
            ||someString.charAt(i)=='o' || someString.charAt(i)=='u'){
                isVowel = true;
            }
        }
        if(isVowel){
            System.out.println("Vowel present in the string");
        }else{
            System.out.println("Vowel not present");
        }
    }
}
