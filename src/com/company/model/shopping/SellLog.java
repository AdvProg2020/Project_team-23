package com.company.model.shopping;


import com.company.model.product.Product;
import com.company.model.shopping.BuyAndSellLog;
import com.company.model.status.ProcessesForBuy;
import com.company.model.user.Customer;
import com.company.model.user.Seller;

import java.util.ArrayList;
import java.util.Date;

public class SellLog extends BuyAndSellLog {
        private ArrayList<Product> sellProducts;
        private double getMoney;
        private double discountMoney;
        private String earmark;
        private ArrayList<Product> soldProducts;
        private Customer customer;
        private ProcessesForBuy processesForBuy;

        public SellLog(Date date, ArrayList<Product> products, double getMoney, double discountMoney,
                       ArrayList<Product> soldProducts, Customer customer) {
                super(date, products);
                this.getMoney = getMoney;
                this.discountMoney = discountMoney;
                this.soldProducts = soldProducts;
                this.customer = customer;
        }

        public double getGetMoney() {
                return getMoney;
        }

        public double getDiscountMoney() {
                return discountMoney;
        }

        public Customer getCustomer() {
                return customer;
        }

        public ProcessesForBuy getProcessesForBuy() {
                return processesForBuy;
        }

        public void setProcessesForBuy(ProcessesForBuy processesForBuy) {
                this.processesForBuy = processesForBuy;
        }

        @Override
        public String toString() {
                return "SellLog{" +
                        "sellProducts=" + sellProducts +
                        ", getMoney=" + getMoney +
                        ", discountMoney=" + discountMoney +
                        ", earmark='" + earmark + '\'' +
                        ", soldProducts=" + soldProducts +
                        ", customer=" + customer +
                        ", processesForBuy=" + processesForBuy +
                        ", id='" + id + '\'' +
                        ", date=" + date +
                        '}';
        }
}

