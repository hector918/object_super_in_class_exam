package org.example;

public class Product {
    private final String name;
    private final double price;
    private final String description;


    public Product(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public void displayProductInfo(){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }
}
