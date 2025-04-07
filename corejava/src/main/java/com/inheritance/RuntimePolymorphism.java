package com.inheritance;

class Animal {
    public void whoAmI() {
        System.out.println("I am an generic animal.");
    }
}
class Dog extends Animal {
    public void whoAmI() {
        System.out.println("I am a dog.");
    }
}
class Cow extends Animal {
    public void whoAmI() {
        System.out.println("I am a cow.");
    }
}
class Snake extends Animal {
    public void whoAmI() {
        System.out.println("I am a snake.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.whoAmI();
        obj = new Dog();
        obj.whoAmI();
        obj = new Cow();
        obj.whoAmI();
        obj = new Snake();
        obj.whoAmI();
    }
}
