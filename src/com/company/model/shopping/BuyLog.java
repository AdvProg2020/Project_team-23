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
        private CodedDiscount codedDiscount;
        private double discountAmount;
        private Seller seller;
        //.........................
        private String address;
        private String phone;
        private String postalCode;
        //.........................
        private ProcessesForBuy processesForBuy;

    public BuyLog(ArrayList<Product> buyProducts, double payedMoney, Date date, CodedDiscount codedDiscount, Seller seller,
                  String address, String phone, String postalCode) {
        super(date , buyProducts);
        this.buyProducts = buyProducts;
        this.payedMoney = payedMoney;
        this.date = date;
        this.codedDiscount = codedDiscount;
        this.seller = seller;
        this.address = address;
        this.phone = phone;
        this.postalCode = postalCode;
    }

    public double getPayedMoney() {
        return payedMoney;
    }

    public CodedDiscount getCodedDiscount() {
        return codedDiscount;
    }

    public Seller getSeller() {
        return seller;
    }

    public ProcessesForBuy getProcessesForBuy() {
        return processesForBuy;
    }

}

