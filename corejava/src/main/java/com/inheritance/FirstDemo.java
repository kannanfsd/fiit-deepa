package com.inheritance;

class B extends A {
    void display() {
        System.out.println("a value is "+a);
        //System.out.println("b value is "+b);
        System.out.println("c value is "+c);
        System.out.println("d value is "+d);
    }
}

public class FirstDemo {
    public static void main(String[] args) {
        B b = new B();

    }
}
