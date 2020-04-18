package com.company.model;

public class Score {
    private int score;
    //only who buy the product can score
    private Customer customer;
    private Product product;



    public Score(int score, Customer customer, Product product) {
        this.score = score;
        this.customer = customer;
        this.product = product;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCostumer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

