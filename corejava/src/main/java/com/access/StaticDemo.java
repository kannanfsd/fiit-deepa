package com.access;

class Static {
    int a = 10;
    static int b = 20;
    void display() {
        a=a+6;
        b++;
        System.out.println("a value is "+a+" and b value is "+b);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Static obj1 = new Static();
        obj1.display();
        Static obj2 = new Static();
        obj2.display();
        Static obj3 = new Static();
        obj3.display();
    }
}
