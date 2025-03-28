package com.access;

class Ipl {
    Ipl() {
        System.out.println("IPL Constructor");
    }
    static void printData() {
        System.out.println("Static method called - printData");
    }
    void display() {
        System.out.println("IPL Team - I am support to CSK");
    }
}

public class ConstructorDemo {
    static void printMessage(){
        System.out.println("Static method called - printMessage");
    }
    public static void main(String[] args) {
        Ipl obj = new Ipl();
        obj.display();
        Ipl.printData();
        printMessage();
    }
}
