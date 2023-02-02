package com.palindrome;

import java.util.Scanner;

public class PalindromeNumberCheck {

    public boolean palindromeCheck(int val){
        int reverse;
        int temp = val;
        int sum = 0;
        while(val > 0){
        reverse = val%10;
        sum = (sum * 10) + reverse;
        val = val/10;
        }
        if(sum==temp){
            System.out.println("The given number is a palindrome");
        return true;}
        else {
            System.out.println("The given number is not a palindrome");
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome: ");
        int num = value.nextInt();
        PalindromeNumberCheck check = new PalindromeNumberCheck();
        check.palindromeCheck(num);
    }
}
