package com.company.lesson32;

public class Category {
    public String  name;
    public Category subCategory;
    public Category mainCategory;

    public Category(String name, Category subCategory) {
        this.name = name;
        this.subCategory = subCategory;
    }

}


