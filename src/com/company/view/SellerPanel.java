package com.company.view;


import com.company.model.Account;
import com.company.model.Category;
import com.company.model.Off;
import com.company.model.Seller;

import java.util.ArrayList;

    public class SellerPanel extends Account {
        private ArrayList<Category> categories;
        private ArrayList<Off> offs;

        public SellerPanel(String username, String firstName, String lastName, String Email, String phone, String password, String roles) {
            super(username, firstName, lastName, Email, phone, password, roles);
        }
        private void viewPersonalInfo(){

        }
        private void editProfileInfo(String input){

        }

        public ArrayList<Off> getOffs() {
            return offs;
        }

        public void setOffs(ArrayList<Off> offs) {
            this.offs = offs;
        }

        public ArrayList<Category> getCategories() {
            return categories;
        }

        public void setCategories(ArrayList<Category> categories) {
            this.categories = categories;
        }

        private void viewCompanyInfo(){
            Seller seller = null;
            seller.getCompany();
        }
        private void viewSellerHistory(){

        }

        private void manageProduct(){

        }

        private void editProduct(String productId){

        }

        public void addProduct(){

        }
        private void removeProduct(){

        }
        public void showCategory(){
            System.out.println(categories);
        }
        public void showOffs(){
            System.out.println(offs);
        }
        private void addOff(){

        }
        private void editOff(){

        }
        private void viewDetailOff(){

        }

    }
