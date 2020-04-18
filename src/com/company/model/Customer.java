package com.company.model;

 import java.util.ArrayList;

    public class Customer extends Account {
        private ArrayList<BuyAndSellLog> historyBuy;

        public Customer(String username, String password) {
            super(username, password);
        }

    }


