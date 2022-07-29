package com.ironhack.edgeservice.model;

import com.ironhack.edgeservice.enums.Categories;
import com.ironhack.edgeservice.enums.Size;

import java.math.BigDecimal;

public class Product {

    private int reference;

    private String name;

    private BigDecimal price;

    private String description;


    private Categories categories;

    private Size size;

    private String image;


    public Product() {
    }

    public Product(String name, BigDecimal price, String description,
                   Categories categories, Size size, String image) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categories = categories;
        this.size = size;
        this.image = image;

    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}

