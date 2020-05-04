package com.company.model.shopping;

import com.company.model.user.Customer;

import java.util.ArrayList;
import java.util.Date;

public class CodedDiscount {
    private ArrayList<Customer> customersDiscount;//customers have discount code
    private double amountOfDiscount;//persent
    private Date startDate;
    private Date finishDate;
    private int repeatedDiscount;

    public CodedDiscount(double amountOfDiscount, Date startDate, Date finishDate) {
        this.amountOfDiscount = amountOfDiscount;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.repeatedDiscount = repeatedDiscount;
    }

    public ArrayList<Customer> getCustomersDiscount() {
        return customersDiscount;
    }

    public void setCustomersDiscount(ArrayList<Customer> customersDiscount) {
        this.customersDiscount = customersDiscount;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    private int addRepeatedDiscount(){
        return repeatedDiscount++;
    }
}
