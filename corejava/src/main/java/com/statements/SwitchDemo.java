package com.statements;

import java.util.Scanner;
import com.inheritance.A;

class B extends A {
  void display() {
      System.out.println("a value is "+a);
      System.out.println("b value is "+getB());
      System.out.println("c value is "+c);
      //System.out.println("d value is "+d);
  }
  @Override
  public void printMessage() {
      System.out.println("Child class method...");
  }
}

public class SwitchDemo {
    public static void main(String[] args) {
        B b = new B();
        b.display();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the case value: ");
//        int num = Integer.parseInt(scan.nextLine());
//        switch (num) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Default");
//        }
//        scan.close();
    }
}
