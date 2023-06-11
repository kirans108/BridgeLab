package com.assignments;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int a = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int b = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int c = in.nextInt();
        int sum=a+b*c;
        int div=c+a/b;
        int sub=a%b+c;
        int multi=a*b+c;
        System.out.println(sum);
        System.out.println(div);
        System.out.println(sub);
        System.out.println(multi);
        if (a >= b && a >= c)
            System.out.println( a + " is the maximum number.");
        else if (b >= a && b >= c)
            System.out.println( b + " is the maximum number.");
        else
            System.out.println( c + " is the maximum number.");
        if (a <= b && a <= c)
            System.out.println( a + " is the minimum number.");
        else if (b <= a && b <= c)
            System.out.println( b + " is the minimum number.");
        else
            System.out.println( c + " is the minimum number.");
        }
    }

