package com.inheritance;

class Parent {
    Parent(){
        System.out.println("Parent Default Constructor");
    }
    Parent(String name) {
        System.out.println("Parent: Name is "+name);
    }
    Parent(String location, long phoneNo) {
        System.out.println("Parent: Location is "+location);
        System.out.println("Parent: Phone No is "+phoneNo);
    }
}

class Child extends Parent{
//    Child(){
//        System.out.println("Child Constructor");
//    }
    Child(String name) {
        super("Karunagaran");
        System.out.println("Child: Name is "+name);
    }
    Child(String location, long phoneNo) {
        super("India", 1234567890L);
        System.out.println("Child: Location is "+location);
        System.out.println("Child: Phone No is "+phoneNo);
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        Child child1 = new Child("Deepa");
        //Child child2 = new Child("USA", 1234567890L);

    }
}
