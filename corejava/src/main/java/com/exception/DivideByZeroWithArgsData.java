package com.exception;

public class DivideByZeroWithArgsData {
    public static void main(String[] args) {
        System.out.println("Begin the divide by zero");
        System.out.println("Args Length: " + args.length);
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[5]);
            int result = numerator / denominator;
            System.out.println("The result is: " + result);
        } catch(ArithmeticException e) {
            //System.out.println("Arithmetic exception occured: "+e.getMessage());
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        }
        System.out.println("End the divide by zero");
    }
}
