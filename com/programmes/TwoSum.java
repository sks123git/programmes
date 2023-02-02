package com.programmes;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,6};
        int[] twoNumbers = new int[2];
        int target = 7; //Target sum to be 7
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {//Adding and checking the condition
                    twoNumbers[0] = i;
                    twoNumbers[1] = j;
                }
                }
            }
        System.out.println("Two numbers are: " + twoNumbers[0] + " " + twoNumbers[1]);
        }
    }
