package com.bridgelabz;

public class SmallestElementsInArray {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[] { 5, 25, 17, 38, 9, 80 };
        int min = arr[0];

        // Print Original array
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // find Smallest element of an array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest Element : " + min);
    }
}
