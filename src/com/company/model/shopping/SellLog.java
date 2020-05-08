package com.company.model.shopping;


import com.company.model.product.Product;
import com.company.model.shopping.BuyAndSellLog;
import com.company.model.status.ProcessesForBuy;
import com.company.model.user.Seller;

import java.util.ArrayList;
import java.util.Date;

public class SellLog extends BuyAndSellLog {
        private ArrayList<Product> sellProducts;
        private double getMoney;
        private double discountMoney;
        private String earmark;
        private Date date;
        private ArrayList<Product> soldProducts;
        private Seller seller;
        private ProcessesForBuy processesForBuy;

    }

