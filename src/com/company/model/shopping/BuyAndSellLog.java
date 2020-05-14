package com.company.model.shopping;
import com.company.model.product.Product;
import com.company.model.status.Processes;

import java.util.ArrayList;
import java.util.Date;

public class BuyAndSellLog {
    protected String id;
    protected Date date;
    protected ArrayList<Product> products;
    //the buyer's and seller's name is missed
    protected Processes processes;

    public BuyAndSellLog(Date date, ArrayList<Product> products) {
        this.date = date;
        this.products = products;
    }

    @Override
    public String toString() {
        return "BuyAndSellLog{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", products=" + products +
                ", processes=" + processes +
                '}';
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}

