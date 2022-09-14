package com.bridgelabz;

public class LargestElementInArray {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[] { 8, 2, 80, 25, 15, 55 };
        int max = arr[0];

        // print original array
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Print largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element in given array is : " + max);

    }
}
