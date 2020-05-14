package com.company.model.user;

import com.company.model.shopping.BuyAndSellLog;
import com.company.model.shopping.CodedDiscount;
import com.company.model.product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
        protected String username;
        protected String firstName;
        protected String lastName;
        protected String Email;
        protected String phone;
        protected String password;
        protected String roles;
        protected ArrayList<CodedDiscount> codedDiscounts;
        private ArrayList<BuyAndSellLog> logs;
        protected ArrayList<Product> productsHistory;
        private Scanner scanner;
        public Account(String username, String firstName, String lastName, String Email, String phone, String password, String roles){
           this.username=username;
           this.firstName=firstName;
           this.lastName=lastName;
           this.Email=Email;
           this.phone=phone;
           this.password=password;
           this.roles=roles;

        }

        public Account(String username, String password) {
            this.username=username;
            this.password=password;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        public void setRoles(String roles) {
            this.roles = roles;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        protected double money;

    public ArrayList<Product> getProductsHistory() {
        return productsHistory;
    }

    public void setProductsHistory(ArrayList<Product> productsHistory) {
        this.productsHistory = productsHistory;
    }
}

