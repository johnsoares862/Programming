package com.learning.numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20;
        printFibonacciSeries(n);
    }
    public static void printFibonacciSeries(int n){
        int a = 0, b = 1, c = 1;
        System.out.print(a + ", " + b);
        for(int i = 2; i < n; i++){
            System.out.print(", " + c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
