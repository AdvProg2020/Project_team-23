package com.company.view;

import com.company.model.product.Category;
import com.company.model.product.Product;


import java.util.HashMap;

public class ProductPanel {
 private static HashMap<String, Product> products =new HashMap<String,Product>();
 private String IdForProduct;
 private Category category;
 private String brandOrCompany;
 private String nameOfProduct;

    public ProductPanel(String idForProduct, Category category, String brandOrCompany,String nameOfProduct) {
        IdForProduct = idForProduct;
        this.category = category;
        this.brandOrCompany = brandOrCompany;
        this.nameOfProduct=nameOfProduct;
    }
    public static HashMap<String,Product> getproducts(){
        return products;
    }

    public static HashMap<String, Product> getProducts() {
        return products;
    }

    public String getIdForProduct() {
        return IdForProduct;
    }

    public Category getCategory() {
        return category;
    }

    public String getBrandOrCompany() {
        return brandOrCompany;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }
}
