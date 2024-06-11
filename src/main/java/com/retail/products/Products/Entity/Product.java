package com.retail.products.Products.Entity;

public class Product {

    Integer id;
    String name;
    Float price;
    String color;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Product() {
    }

    public Product(Integer id, String name, Float price, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
