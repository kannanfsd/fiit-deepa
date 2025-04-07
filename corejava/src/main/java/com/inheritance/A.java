package com.inheritance;

public class A {
    public int a = 10;
    private long b = 20L;
    protected float c = 5.6F;
    double d = 9.8D;
    public long getB() { return b; }
    public void printMessage() {
        System.out.println("Say Hello, this is Super class message. ");
    }
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
