package com.string.to.charr;

public class StringToChar {
    public static void main(String[] args) {
        String string = "III";
        char[] charArray = new char[string.length()];//Taking length of string as array size
        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i); // Adding each character to array
        }
        for (char a: charArray
        ) {
            System.out.println(a);
        }
    }
}
