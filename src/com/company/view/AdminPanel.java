package com.company.view;

import com.company.model.user.Account;

    public class AdminPanel extends Account {


        public AdminPanel(String username, String firstName, String lastName, String email, String phone, String password, String roles) {
            super(username, firstName, lastName, email, phone, password, roles);
        }
        public static void run(){

        }

        private void printAdminInfo() {

        }

        private void editAdminInfo() {

        }

        private void manageUsers() {

        }

        public void viewAllUsers() {

        }

        public void changeTypeUser() {

        }

        public void deleteUser() {

        }

        public void createManagerProfile() {

        }

        public static void manageAllProduct() {

        }

        public static void removeProduct(String productId) {

        }

        public void createDiscountCode() {

        }

        public void viewAllDiscountCodes() {

        }

        public void viewDiscountInfo() {

        }

        public void editDiscountInfo() {

        }

        public void removeDiscountCode() {

        }
        public void showManageRequest(){

        }
        public void detailRequest(String requestId){

        }
        public boolean isManagerAccepted(String input){
            if (input.equalsIgnoreCase("accept")){
                return true;
            }
            return false;
        }
        public void manageCategory(){
            //add or edit category
        }
        public void showProductId(String productId){

        }

    }
