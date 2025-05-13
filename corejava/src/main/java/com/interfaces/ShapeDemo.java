package com.interfaces;

interface IShape {
    void calculateArea();
    void calculateVolume();
}
class Circle implements IShape {
    @Override
    public void calculateArea() {
        double radius = 3.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    @Override
    public void calculateVolume() {
        double radius = 3.0;
        double volume = (4/3) * Math.PI * radius * radius * radius;
        System.out.println("Volume: " + volume);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        IShape shape = new Circle();
        shape.calculateArea();
        shape.calculateVolume();
    }
}
