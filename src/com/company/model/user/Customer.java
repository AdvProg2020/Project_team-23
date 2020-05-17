package com.company.model.user;

 import com.company.model.product.Product;
 import com.company.model.shopping.BuyAndSellLog;

 import java.util.ArrayList;

    public class Customer extends Account {
        private ArrayList<BuyAndSellLog> historyBuy;

        public Customer(String username, String password) {
            super(username, password);
        }

        public Customer() {
            super();
        }

        @Override
        public double getMoney() {
            return super.getMoney();
        }

        @Override
        public void setFirstName(String firstName) {
            super.setFirstName(firstName);
        }

        @Override
        public void setLastName(String lastName) {
            super.setLastName(lastName);
        }

        @Override
        public void setEmail(String email) {
            super.setEmail(email);
        }

        @Override
        public void setPhone(String phone) {
            super.setPhone(phone);
        }

        @Override
        public void setPassword(String password) {
            super.setPassword(password);
        }

        @Override
        public void setRoles(Roles roles) {
            super.setRoles(roles);
        }

        @Override
        public void setMoney(double money) {
            super.setMoney(money);
        }

        @Override
        public ArrayList<Product> getProductsHistory() {
            return super.getProductsHistory();
        }

        @Override
        public void setProductsHistory(ArrayList<Product> productsHistory) {
            super.setProductsHistory(productsHistory);
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "username='" + username + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", Email='" + Email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", money=" + money +
                    '}';
        }
    }


