package com.learning.numbers;

public class PrimeNumber {

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        else if(n  == 2) {
            return true;
        }
        else if(n % 2 == 0){
            return false;
        }
        else{
            for(int i = 3; i <= Math.sqrt(n); i+=2){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 19;

        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}