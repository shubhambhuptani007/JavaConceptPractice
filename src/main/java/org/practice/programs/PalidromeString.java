package org.practice.programs;

public class PalidromeString {
    public static void main(String[] args) {
        String normal = "NitIn";
        String reverse = "";
        for(int i=normal.length()-1;i>=0;i--){
            reverse += normal.charAt(i);
        }
        if(normal.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not Palidrome");
        }
    }
}
