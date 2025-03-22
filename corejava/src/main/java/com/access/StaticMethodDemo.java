package com.access;

class ICC {
  void t20WorldCup() {
      System.out.println("India won the ICC-t20 world cup");
  }
  static void printData() {
      System.out.println("Print data called - ICC class");
  }
}

public class StaticMethodDemo {
    static int a = 10;
    static int b = 20;
    void display(){
        System.out.println("Non-static method called");
        a=a+6;
        b++;
        System.out.println("a value is "+a+" and b value is "+b);
    }
    static void printData() {
        System.out.println("Static method called");
        System.out.println("a value is "+a+" and b value is "+b);
    }
    public static void main(String[] args) {
        StaticMethodDemo obj1 = new StaticMethodDemo();
        obj1.display();
        printData();
        ICC obj2 = new ICC();
        obj2.t20WorldCup();
        ICC.printData();
    }
}
