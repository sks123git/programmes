package com.programmes;

public class MaxPair {
    public static void main(String[] args) {
        int[] array = {1, 3, -9, -8, 2, 7, 10};
        int largest = array[0];
        int secondLargest = array[0];
        int min = array[0];
        int secondMin = array[0];
        int max = 0;
        for (int i = 1; i < array.length; i++) {

            if (largest < array[i]) {
                secondLargest = largest;
                largest = array[i];
            } else if (secondLargest < array[i]) {
                secondLargest = array[i];
            }

            if (min > array[i]) {
                secondMin = min;
                min = array[i];
            } else if (secondMin > array[i]) {
                secondMin = array[i];
            }
        }

        if (largest * secondLargest > min * secondMin) {
            System.out.println("largest product is: " + (largest * secondLargest));
        } else {
            System.out.println("Largest product is: " + (min * secondMin));
        }
    }
}