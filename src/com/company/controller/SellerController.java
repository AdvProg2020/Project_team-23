package com.company.controller;

    import com.company.model.product.Product;
    import com.company.model.user.Customer;
    import com.company.model.user.Seller;

    import java.util.ArrayList;

    public class SellerController {
        private static Seller seller;

        public void editPersonalInformation(String field , String editedField) {
            Seller seller = new Seller();
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
            Seller seller = new Seller();
            while (true) {
                if (RegisterAndLoginController.isPhoneNumberValid(phone) == true) {
                    seller.setPhone(phone);
                    break;
                } else {
                    System.out.println("invalid phone");
                    continue;
                }
            }
        }

        private static void editEmail (String email){
            Seller seller = new Seller();
            while (true) {
                if (RegisterAndLoginController.isEmailAddressValid(email) == true) {
                    seller.setEmail(email);
                    break;
                } else {
                    System.out.println("invalid Email");
                    continue;
                }
            }
        }

        private static void editFirstName(String firstName){
            Seller seller = new Seller();
            while (true) {
                if (RegisterAndLoginController.isPhoneNumberValid(firstName) == true) {
                    seller.setPhone(firstName);
                    break;
                } else {
                    System.out.println("invalid name");
                    continue;
                }
            }
        }

        private static void editLastName(String lastName){
            Seller seller = new Seller();
            while (true) {
                if (RegisterAndLoginController.isPhoneNumberValid(lastName) == true) {
                    seller.setPhone(lastName);
                    break;
                } else {
                    System.out.println("invalid name");
                    continue;
                }
            }
        }

        private static void editPassword (String password){
            Seller seller = new Seller();
            while (true) {
                if (RegisterAndLoginController.isPhoneNumberValid(password) == true) {
                    seller.setPhone(password);
                    break;
                } else {
                    System.out.println("invalid password");
                    continue;
                }
            }
        }

        public void editProductInformation() {}

        public void addProduct(String productId, String name, String brandOrCompany, double cast,
                               double averageScore, Seller seller, String category, ArrayList<String> subCategory, String description) {

        }

        public void removeProduct() {}

        public void editOff(String id, ArrayList<Product> products, String exactStartTime , String exactEndTime , int offAmount) {}

        public void addOff(String id, ArrayList<Product> products, String exactStartTime , String exactEndTime , int offAmount) {}

        public static void viewCredit() {}

        public double viewBalance() {
            Seller seller = new Seller();
            return seller.getMoney();
        }

        public static void viewPersonalInfo() {
            Seller seller = new Seller();
            seller.toString();
        }




    }



