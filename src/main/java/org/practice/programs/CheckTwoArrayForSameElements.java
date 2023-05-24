package org.practice.programs;

public class CheckTwoArrayForSameElements {
    public static void main(String[] args) {
        int arr1[] = new int[]{12,213,123,123,3123,12312,312};
        int arr2[] = new int[]{23,1232,31,3123,12,3321};
        if(arr1.length!=arr2.length){
            System.out.println("Not equal because of size");
        }else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("Not equal");
                    break;
                }
            }
        }
    }
}
