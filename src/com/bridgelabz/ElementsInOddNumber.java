package com.bridgelabz;

public class ElementsInOddNumber {
    public static void main(String[] args) {
        //Initialize array
        int[] arr = new int[] {1,2,3,4,5,6};

        //Display given array
        System.out.println("Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Find element of Odd position
        System.out.println();

        System.out.println("Element of given array present on odd position : ");
        for(int i=0; i<arr.length; i=i+2) {
            System.out.print(arr[i] + " ");
        }
    }
}
