package com.interfaces;

@FunctionalInterface
public interface ISayHello {
    int a = 10;      //all variable by default as final static
    void sayHello(); //concrete method - not allowed by default as abstract

    static void display1() {   //static method allowed - Java 8
    }
    default void display2() { //default method allowed
    }
    private void display3() {  //private method allowed
    }
}

// Lambda express  - void display() { }
// () -> {
//   define the method
// }