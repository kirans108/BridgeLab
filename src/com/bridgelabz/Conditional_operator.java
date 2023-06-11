package com.bridgelabz;

public class Conditional_operator {
    public static void main(String[] args) {
        int num=10;
        int num2=20;
        if(num<=num2)
        {
            System.out.println("num is less then num2");
        }
        else
        {
            System.out.println("num2 is less then num2");
        }
        if (num>=num2){
            System.out.println("num is greater value");
        }
        else {
            System.out.println("mum2 is greater value");
        }
        if (num==num2){
            System.out.println("both num & num2  are equal");
        }
        else{
            System.out.println("both num & num2 are not equal");
        }
    }
}
