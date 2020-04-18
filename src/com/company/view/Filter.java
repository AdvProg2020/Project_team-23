package com.company.view;

import com.company.model.Category;
import com.company.model.Product;

public class Filter {
    private Category category;
    private Product product;

    public Filter(Category category, Product product) {
        this.category = category;
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public Product getProduct() {
        return product;
    }
}
