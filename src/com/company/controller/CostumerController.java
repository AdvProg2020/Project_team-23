package com.company.controller;


import com.company.model.product.Product;
import com.company.model.shopping.CodedDiscount;
import com.company.model.user.Customer;
import com.company.model.user.Seller;
import com.company.view.RegisterPanel;

import java.util.ArrayList;
import java.util.HashMap;

public class CostumerController {

    public void editPersonalInformation(String field , String editedField) {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Customer customer = new Customer();
        if (field.equalsIgnoreCase("username")){
            System.out.println("you can't edit your username !");

        }else if (field.equalsIgnoreCase("phone")){
            editPhone(editedField);
        }else if (field.equalsIgnoreCase("email")){
            editEmail(editedField);

        }else if (field.equalsIgnoreCase("first")){
            editFirstName(editedField);

        }else if (field.equalsIgnoreCase("last")){
            editLastName(editedField);

        }else if (field.equalsIgnoreCase("password")){
            editPassword(editedField);
        }
    }

    private static void editPhone(String phone){
        Customer customer = new Customer();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(phone) == true) {
                customer.setPhone(phone);
                break;
            } else {
                System.out.println("invalid phone");
                continue;
            }
        }
    }

    private static void editEmail (String email){
        Customer customer = new Customer();
        while (true) {
            if (RegisterAndLoginController.isEmailAddressValid(email) == true) {
                customer.setEmail(email);
                break;
            } else {
                System.out.println("invalid Email");
                continue;
            }
        }
    }

    private static void editFirstName(String firstName){
        Customer customer = new Customer();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(firstName) == true) {
                customer.setPhone(firstName);
                break;
            } else {
                System.out.println("invalid name");
                continue;
            }
        }
    }

    private static void editLastName(String lastName){
        Customer customer = new Customer();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(lastName) == true) {
                customer.setPhone(lastName);
                break;
            } else {
                System.out.println("invalid name");
                continue;
            }
        }
    }

    private static void editPassword (String password){
        Customer customer = new Customer();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(password) == true) {
                customer.setPhone(password);
                break;
            } else {
                System.out.println("invalid password");
                continue;
            }
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

