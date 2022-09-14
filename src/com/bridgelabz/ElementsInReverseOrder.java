package com.bridgelabz;

public class ElementsInReverseOrder {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        // Display original array
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Display element of array in reverse order
        System.out.println("Reverse Array : ");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
