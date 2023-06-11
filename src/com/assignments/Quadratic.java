package com.assignments;

import java.util.Scanner;

public class Quadratic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = scanner.nextDouble();
            double delta = b * b - 4 * a * c;
            if (delta >= 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
            scanner.close();
        }
    }

