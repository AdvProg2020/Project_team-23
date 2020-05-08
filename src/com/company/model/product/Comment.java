package com.company.model.product;

import com.company.model.product.Product;
import com.company.model.status.Processes;
import com.company.model.user.Customer;

public class Comment {
    private String text;
    private Customer username;
    private Product product;
    private Processes commentProcesses;

    public Comment(String text, Customer username, Product product, Processes commentProcesses) {
        this.text = text;
        this.username = username;
        this.product = product;
        this.commentProcesses = commentProcesses;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Customer getUsername() {
        return username;
    }

    public void setUsername(Customer username) {
        this.username = username;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Processes getCommentProcesses() {
        return commentProcesses;
    }

    public void setCommentProcesses(Processes commentProcesses) {
        this.commentProcesses = commentProcesses;
    }
}
