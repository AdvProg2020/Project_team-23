package com.company.model.user;


import com.company.model.shopping.SellLog;

public class Seller extends Account {
        private SellLog sellProducts;
        private String company;
        public Seller(String username, String password) {
            super(username, password);
        }

    @Override
    public String toString() {
        return "Seller{" +
                "company='" + company + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }

    public void getCompany() {
    }

    public void setCompany(String company) {
        this.company = company;
    }
}



