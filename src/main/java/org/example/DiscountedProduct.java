package org.example;

public class DiscountedProduct extends Product {
    public double discountPercentage;
    public DiscountedProduct(String name, double price, String description, double discountPercentage){
        super(name, price, description);
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscountedPrice(){
        return this.getPrice() * (1 - discountPercentage/100);
    }
}