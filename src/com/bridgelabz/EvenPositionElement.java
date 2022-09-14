package com.bridgelabz;

public class EvenPositionElement {
    public static void main(String[] args) {
        //Initialize array
        int[] arr = new int[] {1,2,3,4,5,6};

        System.out.println("Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Even position array
        System.out.println("Element of given array present on even position : ");
        for(int i=1; i<arr.length; i=i+2) {
            System.out.print(arr[i] + " ");
        }
    }
}
