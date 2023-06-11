package com.assignments;

public class FibonacciSeries {
    public static void firstTenNumbers(int count)
    {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1; i<=count-2; i++)
        {
            int sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args) {
        int count = 20;
        firstTenNumbers(count);
    }
}
