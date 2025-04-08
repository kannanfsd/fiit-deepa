package com.abstracts;

abstract class LivingThing {
    String message = "Hello from LivingThing class.";
    void printMessage() {
        System.out.println(message);
    }
    abstract void walk();
}

class Human extends LivingThing {
    void walk() {
        System.out.println(message);
    }
}
class Cow extends LivingThing {
    void walk() {
        System.out.println(message);
    }
}

public class FirstDemo {
    public static void main(String[] args) {
        LivingThing obj = new Human();
        obj.printMessage();
        obj.message = "Human walk with 2 legs.";
        obj.walk();

        obj = new Cow();    // apply run-time polymorphism
        obj.message = "Cow walk with 4 legs.";
        obj.walk();
    }
}
