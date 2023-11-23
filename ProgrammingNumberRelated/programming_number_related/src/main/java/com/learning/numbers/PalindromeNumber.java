package com.learning.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12345;
        if(isCheckPalindrome(number)){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }
    }
    static boolean isCheckPalindrome(int n){
        int reverse = 0, temp = 0;
        if(n >= 0 && n < 10){
            return true;
        }
        else if (n < 0){
            n = Math.abs(n);
        }
        temp = n;
        while (temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if(n == reverse)
            return true;
        return  false;
    }
}
