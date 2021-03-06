package com.company.model.user;


import com.company.model.product.Product;
import com.company.model.shopping.CodedDiscount;
import com.company.model.shopping.SellLog;

import java.util.ArrayList;

public class Seller extends Account {
        private SellLog sellProducts;
        private String company;
        public Seller(String username, String password) {
            super(username, password);
        }

    public Seller() {

    }

    @Override
    public String toString() {
        return "Seller{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Email='" + Email + '\'' +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public double getMoney() {
        return super.getMoney();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public void setMoney(double money) {
        super.setMoney(money);
    }

    @Override
    public ArrayList<Product> getProductsHistory() {
        return super.getProductsHistory();
    }

    @Override
    public void setProductsHistory(ArrayList<Product> productsHistory) {
        super.setProductsHistory(productsHistory);
    }

    public void getCompany() {
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public ArrayList<CodedDiscount> getCodedDiscounts() {
        return super.getCodedDiscounts();
    }

    @Override
    public void setCodedDiscounts(ArrayList<CodedDiscount> codedDiscounts) {
        super.setCodedDiscounts(codedDiscounts);
    }
}



