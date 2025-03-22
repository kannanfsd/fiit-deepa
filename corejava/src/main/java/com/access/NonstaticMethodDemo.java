package com.access;

class IplTeam {
    public void display() {
        System.out.println("IPL Team - I am support to CSK");
    }
}
public class NonstaticMethodDemo {
    public void printData() {
        System.out.println("Hello, welcome to IPL 2025 season");
    }
    public static void main(String[] args) {
        new IplTeam().display();
        new NonstaticMethodDemo().printData();
    }
}
