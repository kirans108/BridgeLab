package com.assignments.array;

public class SmallestElement {
    public static void main(String[] args) {


        int[] a = {15, 5, 20, 10, 2, 3, 6};

        int smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("smallest element in array:" +smallest);
    }
}