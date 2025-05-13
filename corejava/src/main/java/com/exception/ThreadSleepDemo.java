package com.exception;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        System.out.println("Begin the program");
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello, welcome Mr./Ms. Deepa");
        }
        System.out.println("End the program");
    }
}
