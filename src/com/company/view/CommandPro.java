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
            if (account.getRoles() == Roles.CUSTOMER)
                CostumerController.viewPersonalInfo();
            else if (account.getRoles() == Roles.SELLER) {

            }

        } else if (command.equalsIgnoreCase("login")) {

        } else if (command.equalsIgnoreCase("register")) {

            input = scanner.nextLine();
            if (input.startsWith("create account "))
                registerPanel.registerAccount(input);

        } else if (command.equalsIgnoreCase("")) {

        } else if (command.equalsIgnoreCase("view balance")) {
            if (account.getRoles() == Roles.SELLER) {
                sellerController.viewBalance();

            } else if (account.getRoles() == Roles.CUSTOMER){
                costumerController.viewBalance();
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

