package com.company.controller;


import com.company.model.product.Product;
import com.company.model.user.Customer;

import java.util.ArrayList;
import java.util.HashMap;

public class CostumerController {

    public static void editPersonalInformation() {
    }

    public static void viewPersonalInfo() {
        Customer customer = new Customer();
        customer.toString();
    }

    public void viewCart() {
    }

    public void purchase() {
    }

    public void receiverInformation() {
    }

    public boolean discountCode() {
        return false;
    }

    public boolean payment() {
        return false;
    }

    public HashMap<Integer, String> viewOrders() {
        return null;
    }


    public Product showOrder() {
        return null;
    }

    public boolean rateProduct() {
        return false;
    }

    public double viewBalance() {
        Customer customer = new Customer();
        return customer.getMoney();
    }

    public ArrayList<String> viewDiscountCodes() {
        return null;
    }


}

