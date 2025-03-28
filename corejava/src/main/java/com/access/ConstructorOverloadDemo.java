package com.access;

class Product {
    int prodId;
    String prodName;
    double prodPrice;
    Product() {
        this(101);
        System.out.println("Default constructor called");
    }
    Product(int prodId) {
        this(prodId,"HP Laptop");
        this.prodId = prodId;   //initialized value
    }
    Product(int prodId, String prodName) {
        this(prodId, prodName, 50000.0);
        this.prodId = prodId;
        this.prodName = prodName;
    }
    Product(int prodId, String prodName, double prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
    void printData() {
        System.out.println("Product id is "+prodId);
        System.out.println("Product name is "+prodName);
        System.out.println("Product price is "+prodPrice);
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.printData();
    }
}
