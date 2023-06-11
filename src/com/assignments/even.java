package com.assignments;

import org.w3c.dom.ls.LSOutput;

public class even {
    public static void addition() {
        int i;
        int num = 50;
        int sum = 0;

        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("sum of numbers" + ":" + sum);
    }
    public static void main(String[] args) {
        addition();
        int count = 0;
        for (int i=1;i<=50;i++){
            if(i%2==0){
                count++;
            }

        }
        System.out.println("count of even numbers from 1 to 50"+":"+count);
    }
}