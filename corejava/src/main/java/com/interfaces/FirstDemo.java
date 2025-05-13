package com.interfaces;

interface IDemo {
    String message = "Say Hello";
    void draw();
    void display();
    static void staticMethod() {
        System.out.println("Hi, I'm static method");
    }
    default void defaultMethod() {
        privateMethod();
        System.out.println("Hi, I'm default method2");
    }
    private void privateMethod() {
        System.out.println("Hi, I'm private method");
    }
}

class Demo implements IDemo {
    @Override
    public void draw() {
        System.out.println("Hi, I'm draw method");
    }
    @Override
    public void display() {
        System.out.println("Hi, I'm display method");
    }
}

public class FirstDemo {
    public static void main(String[] args) {
        IDemo obj = new Demo();
        obj.draw();
        obj.display();
        obj.defaultMethod();
        IDemo.staticMethod();
    }
}
