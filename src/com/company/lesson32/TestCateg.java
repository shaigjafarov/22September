package com.company.lesson32;

public class TestCateg {

    public static void main(String[] args) {
        Category category= new Category("aletler", null);
        category.mainCategory=null;
        category.subCategory= new Category("elektrikli",null);
        category.subCategory.mainCategory=category;
        category.subCategory.subCategory=new Category("tozsoran",null);
        category.subCategory.subCategory.mainCategory=category.subCategory;
        category.subCategory.subCategory.subCategory=new Category("dyson",null);
    }
}
