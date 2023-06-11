package com.assignments.array;

public class LargestElement {

        public static void main(String[] args) {

            int[] array = { 10, 5, 8, 15, 3 };


            int largest = array[0];


            for (int i = 1; i < array.length; i++) {
                if (array[i] > largest) {
                    largest = array[i];
                }
            }


            System.out.println("Largest element in the array: " + largest);
        }
    }


