package com.company.view;


import com.company.Main;
import com.company.controller.CostumerController;
import com.company.controller.SellerController;
import com.company.model.user.Account;
import com.company.model.user.Customer;
import com.company.model.user.Roles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandPro {

    public static void recognizeCommand(String command) {
        RegisterPanel registerPanel = new RegisterPanel();
        SellerController sellerController = new SellerController();
        CostumerController costumerController = new CostumerController();
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        String input;
        if (command.equalsIgnoreCase("help")) {
            help();
        } else if (command.equalsIgnoreCase("view personal info")) {
            viewPersonalInfo();

        } else if (command.equalsIgnoreCase("login")) {

        } else if (command.equalsIgnoreCase("register")) {

            input = scanner.nextLine();
            if (input.startsWith("create account"))
                registerPanel.registerAccount(input);

        } else if (command.equalsIgnoreCase("view discount codes")) {
            viewDiscountCodes();

        } else if (command.equalsIgnoreCase("view balance")) {
            viewBalance();
        }
        else if (command.startsWith("edit")){
            editField(command);
        }
    }

    private static void viewBalance() {
        SellerController sellerController = new SellerController();
        CostumerController costumerController = new CostumerController();
        Account account = new Account();
        if (account.getRoles() == Roles.CUSTOMER)
            sellerController.viewBalance();
        else if (account.getRoles() == Roles.SELLER) {
            costumerController.viewBalance();
        }
    }

    private static void viewPersonalInfo() {
        Account account = new Account();
        if (account.getRoles() == Roles.CUSTOMER)
            CostumerController.viewPersonalInfo();
        else if (account.getRoles() == Roles.SELLER) {
            SellerController.viewPersonalInfo();
        }
    }

    private static void viewDiscountCodes(){
        CostumerController costumerController = new CostumerController();
        Customer customer = new Customer();
        if (customer.getRoles() == Roles.CUSTOMER) {
            costumerController.viewDiscountCodes();
        }else{
            System.out.println("there is no discount code for you !");
        }
    }

    private static void editField(String command){
        CostumerController costumerController = new CostumerController();
        SellerController sellerController = new SellerController();
        Account account = new Account();
        String word[] = command.split("\\s+");
        if ((word[2].equalsIgnoreCase("first")) || (word[2].equalsIgnoreCase("last"))){
            if (account.getRoles() == Roles.CUSTOMER){
                costumerController.editPersonalInformation(word[1] , word[3]);
            }else if (account.getRoles() == Roles.SELLER){
                sellerController.editPersonalInformation(word[1] , word[3]);
            }
        }else {
            if (account.getRoles() == Roles.CUSTOMER){
                costumerController.editPersonalInformation(word[1] , word[2]);
            }else if (account.getRoles() == Roles.SELLER){
                sellerController.editPersonalInformation(word[1] , word[2]);
            }
        }
    }

    private static void help() {
        System.out.print("Register\n" +
                "Login\n" +
                "Sort by [filed]\n" +
                "Help");
    }

}

