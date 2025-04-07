package org.example;

public class Product {
    private String name;
    private double price;
    private String desciption;


    public Product(String name, double price, String desciption){
        this.name = name;
        this.price = price;
        this.desciption = desciption;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.desciption;
    }

    public void displayProductInfo(){

    }
}
