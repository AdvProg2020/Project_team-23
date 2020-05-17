package com.company.model.user;

import com.company.controller.RegisterAndLoginController;
import com.company.model.shopping.BuyAndSellLog;
import com.company.model.shopping.CodedDiscount;
import com.company.model.product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private ArrayList<Account> allUsers;
    protected String username;
    protected String firstName;
    protected String lastName;
    protected String Email;
    protected String phone;
    protected String password;
    protected Roles roles;
    protected ArrayList<CodedDiscount> codedDiscounts;
    private ArrayList<BuyAndSellLog> logs;
    protected ArrayList<Product> productsHistory;
    private Scanner scanner;

    public Account(String username, String password, String firstName, String lastName, String Email, String phone, Roles roles) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.phone = phone;
        this.password = password;
        this.roles = roles;
        this.allUsers = new ArrayList<>();

    }

    public void addNewUser(Account account){
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        if (isThisUsernameTaken(registerAndLoginController.getUsername()) == false) {
            allUsers.add(account);
        }
    }

    private boolean isThisUsernameTaken(String username1){
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        for (Account allUser : allUsers) {
            if (registerAndLoginController.getUsername().equalsIgnoreCase(username)){
                registerAndLoginController.setRegisterSuccessfully(true);
                return true;
            }else {
                registerAndLoginController.setRegisterSuccessfully(false);
            }
        }
        return false;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    protected double money;

    public ArrayList<Product> getProductsHistory() {
        return productsHistory;
    }

    public void setProductsHistory(ArrayList<Product> productsHistory) {
        this.productsHistory = productsHistory;
    }
}

