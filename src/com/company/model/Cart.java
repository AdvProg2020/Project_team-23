package com.company.model;


import com.company.model.product.Product;
import com.company.model.user.Customer;
import com.company.model.user.Seller;

import java.util.ArrayList;
import java.util.HashMap;

    public class Cart {
        private Customer customer;
        private HashMap<Product, Integer> product ;
        private ArrayList<Seller> sellersSupportThisProduct;
        private String sellerSupportThisProduct;

        public void setSellersSupportThisProduct(ArrayList<Seller> sellersSupportThisProduct) {
            this.sellersSupportThisProduct = sellersSupportThisProduct;
        }

        public void setSellerSupportThisProduct(String sellerSupportThisProduct) {
            this.sellerSupportThisProduct = sellerSupportThisProduct;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public HashMap<Product, Integer> getProduct() {
            return product;
        }

        public void setProduct(HashMap<Product, Integer> product) {
            this.product = product;
        }
        private void addCartToData(){

        }
        private void updateCart(){

        }
        private void removeCardFromData(){

        }

    }

