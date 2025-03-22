package com.fundamental;

public class Box {
    int a;
    String name;
    void display() {
        String msg = "Hi, welcome to java";
        System.out.println(msg+" "+a+" "+name);
    }
    public static void main(String[] args) {
        Box b = new Box();
        b.a = 10;
        b.name = "Ram";
        b.display();
    }
}
