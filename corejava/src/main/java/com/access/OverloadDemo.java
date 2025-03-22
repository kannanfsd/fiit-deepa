package com.access;

class Overload {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public long add(long a, long b) {
        return a+b;
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.add(10, 20);
        overload.add(10, 20, 30);
        System.out.println("sum of two long numbers is "+overload.add(100L, 200L));
    }
}
