package com.company.model.user;

import com.company.model.product.Product;

import java.util.ArrayList;

public class Manager  extends Account {

    @Override
    public String toString() {
        return "Manager{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Email='" + Email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
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

    public Manager(String username, String password) {
        super(username, password);
        Manager manager;

        }
    }


