package com.access;

class Nonstatic {
    int a = 5;
    int b = 8;
    void display() {
        a = a+6;
        b++;
        System.out.println("a value is "+a+" and b value is "+b);
    }
}

public class NonstaticDemo {
    public static void main(String[] args) {
        Nonstatic obj1 = new Nonstatic();
        obj1.display();
        Nonstatic obj2 = new Nonstatic();
        obj2.display();
        Nonstatic obj3 = new Nonstatic();
        obj3.display();
    }
}
