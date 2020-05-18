package com.company.controller;

import com.company.model.user.Account;
import com.company.model.shopping.CodedDiscount;
import com.company.model.user.Customer;
import com.company.model.user.Manager;
import com.company.model.user.Seller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.regex.Matcher;

public class AdminController {

        private static Account account;

        public static String viewPersonalInformation(){
            Manager manager = new Manager();
            return manager.toString();
        }
    public void editPersonalInformation(String field , String editedField) {
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
        Manager manager = new Manager();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(phone) == true) {
                manager.setPhone(phone);
                break;
            } else {
                System.out.println("invalid phone");
                continue;
            }
        }
    }

    private static void editEmail (String email){
        Manager manager = new Manager();
        while (true) {
            if (RegisterAndLoginController.isEmailAddressValid(email) == true) {
                manager.setEmail(email);
                break;
            } else {
                System.out.println("invalid Email");
                continue;
            }
        }
    }

    private static void editFirstName(String firstName){
        Manager manager = new Manager();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(firstName) == true) {
                manager.setPhone(firstName);
                break;
            } else {
                System.out.println("invalid name");
                continue;
            }
        }
    }

    private static void editLastName(String lastName){
        Manager manager = new Manager();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(lastName) == true) {
                manager.setPhone(lastName);
                break;
            } else {
                System.out.println("invalid name");
                continue;
            }
        }
    }

    private static void editPassword (String password){
        Manager manager = new Manager();
        while (true) {
            if (RegisterAndLoginController.isPhoneNumberValid(password) == true) {
                manager.setPhone(password);
                break;
            } else {
                System.out.println("invalid password");
                continue;
            }
        }
    }

        public boolean editInformationField() {
            return false;
        }

        public HashMap<Integer, String> manageAccounts() {
            return null;
        }

        public static Account viewAccounts() {
            return null;
        }

        public boolean deleteAccount() {
            return false;
        }

        public boolean createAdminProfile() {
            return false;
        }

        public static HashMap<Integer, String> manageAllProducts() {
            return null;
        }

        public static boolean removeProduct() {
            return false;
        }

        public static boolean createDiscountCode() {
            return false;
        }

        public static ArrayList<String> viewDiscountCodes() {
            return null;
        }

        public static CodedDiscount viewDiscountCode() {
            return null;
        }

        public static boolean editDiscountCode() {
            return false;
        }

        public static boolean removeDiscountCode() {
            return false;
        }

        public static HashMap<Integer, String> manageRequests() {
            return null;
        }

        public static void showDetails() {

        }

        public static boolean acceptRequest() {
            return false;
        }

        public static boolean declineRequest() {
            return false;
        }

        public static ArrayList<String> manageCategories() {
            return null;
        }

        public static boolean editCategory() {
            return false;
        }

        public static boolean addCategory() {
            return false;
        }

        public static boolean removeCategory() {
            return false;
        }
    }





