package com.company.controller;


import com.company.model.product.Product;
import com.company.model.shopping.CodedDiscount;
import com.company.model.user.Customer;
import com.company.model.user.Seller;

import java.util.ArrayList;
import java.util.HashMap;

public class CostumerController {

    public void editPersonalInformation(String field , String editedField) {
        Customer customer = new Customer();
        if (field.equalsIgnoreCase("username")){
            System.out.println("you can't edit your username !");

        }else if (field.equalsIgnoreCase("phone")){
            customer.setPhone(editedField);
        }else if (field.equalsIgnoreCase("email")){
            customer.setEmail(editedField);

        }else if (field.equalsIgnoreCase("first")){
            customer.setFirstName(editedField);

        }else if (field.equalsIgnoreCase("last")){
            customer.setLastName(editedField);

        }else if (field.equalsIgnoreCase("password")){
            customer.setPassword(editedField);
        }
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

    public ArrayList<CodedDiscount> viewDiscountCodes() {
        Customer customer = new Customer();
        return customer.getCodedDiscounts();
    }


}

