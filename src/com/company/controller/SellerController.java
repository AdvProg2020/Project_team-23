package com.company.controller;

    import com.company.model.product.Product;
    import com.company.model.user.Customer;
    import com.company.model.user.Seller;

    import java.util.ArrayList;

    public class SellerController {
        private static Seller seller;

        public void editPersonalInformation() {}

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



