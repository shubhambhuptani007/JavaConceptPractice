package org.practice.programs;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2222,2,2,23,34,2,342,45,34,555};
        int largest = arr[0];
        int secondLargest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else{
                if(arr[i]>secondLargest){
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
    }
}
