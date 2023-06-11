package com.assignments;

import org.w3c.dom.ls.LSOutput;

public class sum {

    public static void addition() {
        int i;
        int num = 10;
        int sum = 0;

        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("sum of numbers" + "=" + sum);
    }

    public static void main(String[] args) {
        addition();
    }
}
