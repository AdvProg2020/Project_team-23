package com.company.model.user;


import com.company.model.shopping.SellLog;

public class Seller extends Account {
        private SellLog sellProducts;
        private String company;
        public Seller(String username, String password) {
            super(username, password);
        }


    public void getCompany() {
    }
}



