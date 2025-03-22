package com.fundamental;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * 
     * @param args
     * @return
     */
    public static String handleArguments(String[] args) {
        if(args.length > 0) {
            return "Arguments received: "+String.join(", ", args);
        } else {
            return "No arguments received";
        }
    }
}
