package com.access;

public class ReturnDemo {
    public String numberInWords(int number) {
        String result = "Generic number";
        if(number==1) {
            result = "one";
        }
        else if(number==2) {
            result = "two";
        }
        else if(number==3) {
            result = "three";
        }
        return result;
    }
    public static void main(String[] args) {
        ReturnDemo rd = new ReturnDemo();
        System.out.println(rd.numberInWords(1));
        System.out.println(rd.numberInWords(2));
        System.out.println(rd.numberInWords(3));
        System.out.println(rd.numberInWords(4));
    }
}
