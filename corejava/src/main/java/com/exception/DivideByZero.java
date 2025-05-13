package com.exception;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Begin the calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number [numerator]: ");
        int numerator = sc.nextInt();
        System.out.println("Enter the second number [denominator]: ");
        int denominator = sc.nextInt();
        try {
            int result = numerator / denominator;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            //System.out.println("Arithmetic exception occured: "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End the calculation");
    }
}
