package com.company.model.shopping;


    import com.company.model.product.Product;
    import com.company.model.shopping.BuyAndSellLog;
    import com.company.model.status.ProcessesForBuy;
    import com.company.model.user.Seller;

    import java.util.ArrayList;
    import java.util.Date;

public class BuyLog extends BuyAndSellLog {
        private ArrayList<Product> buyProducts;
        private double payedMoney;
        private String earmark;
        private Date date;
        private double discountAmount;
        private Seller seller;
        private ProcessesForBuy processesForBuy;

    }

