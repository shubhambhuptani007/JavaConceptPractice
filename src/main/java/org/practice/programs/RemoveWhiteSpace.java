package org.practice.programs;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String someString = "Shubham is a good boy";
        String anotherString = "";
        for(int i=0;i<someString.length();i++){
            if(!Character.isWhitespace(someString.charAt(i))){
                anotherString+=someString.charAt(i);
            }
        }
        System.out.println("Orginal ");
        System.out.println(someString);
        System.out.println("After removing white space");
        System.out.println(anotherString);
    }
}
