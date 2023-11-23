package com.learning.numbers;

public class FindSecondMaxInArray {
    public static void main(String[] args) {
        int[] a = {10,35,12,1,34,9};
        if(a.length < 2){
            System.out.println("Invalid input array");
        }
        else {
            int first,second;
            first = second = Integer.MIN_VALUE;
            for(int i = 0; i < a.length; i++){
                if(a[i] > first){
                    second = first;
                    first = a[i];
                }
                else if(a[i] > second && a[i] != first){
                    second = a[i];
                }
            }
            System.out.println("First Highest : " + first);
            System.out.println("Second Highest : " + second);
        }
    }
}
