package com.company.model.user;

 import com.company.model.shopping.BuyAndSellLog;

 import java.util.ArrayList;

    public class Customer extends Account {
        private ArrayList<BuyAndSellLog> historyBuy;

        public Customer(String username, String password) {
            super(username, password);
        }

    }


