package com.assignments;

public class PrimeNumbers {
        public static void isPrimeNumber(int num)
        {
            int flag=0;
            for(int i=2; i<num; i++)
            {
                if(num%i==0)
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Given number is a prime");
            }
            else
            {
                System.out.println("Given number is not a prime");
            }
        }
        public static void main(String[] args) {
            int num=3;
            isPrimeNumber(num);
    }
}
