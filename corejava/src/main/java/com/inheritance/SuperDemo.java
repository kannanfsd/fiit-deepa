package com.inheritance;

class Base {
    public void printMessage() {
        System.out.println("Hello from Base class.");
    }
}
class Derived extends Base {
    public void printMessage() {
        super.printMessage();
        System.out.println("Hello from Derived class.");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.printMessage();
//        Base obj1 = new Derived();
//        obj1.printMessage();
    }
}
