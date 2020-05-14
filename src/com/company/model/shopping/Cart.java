package com.company.model.shopping;


import com.company.model.product.Product;
import com.company.model.user.Customer;
import com.company.model.user.Seller;

import java.util.ArrayList;
import java.util.HashMap;

    public class Cart {
        private Product product;
        private int number;
        private Seller seller;
        private ArrayList<Seller> sellersSupportThisProduct;
        private String sellerSupportThisProduct;

        public void setSellersSupportThisProduct(ArrayList<Seller> sellersSupportThisProduct) {
            this.sellersSupportThisProduct = sellersSupportThisProduct;
        }

        public void setSellerSupportThisProduct(String sellerSupportThisProduct) {
            this.sellerSupportThisProduct = sellerSupportThisProduct;
        }

        public Seller getSeller() {
            return seller;
        }

        public void setSeller(Seller seller) {
            this.seller = seller;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        private void addCartToData(){

        }
        private void updateCart(){

        }
        private void removeCardFromData(){

        }

    }

