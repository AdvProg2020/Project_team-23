package com.company.view;


import com.company.Main;
import com.company.controller.CostumerController;
import com.company.model.user.Account;
import com.company.model.user.Roles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class CommandPro {

        public static void recognizeCommand(String command) {

//            String commandPattern = null;
//            Pattern pattern = Pattern.compile(commandPattern);
//            Matcher matcher = pattern.matcher(command);
            //we have to define patterns for commands then
            //if command matches with a pattern we run the command
            Scanner scanner = new Scanner(System.in);
            String input;
            if (command.equalsIgnoreCase("help")) {
                help();
            } else if (command.equalsIgnoreCase("view personal info")) {
                Account account = new Account();
                if (account.getRoles()== Roles.CUSTOMER)
                    CostumerController.viewPersonalInfo();
                else if (account.getRoles()==Roles.SELLER){

                }

            } else if (command.equalsIgnoreCase("login")) {

            } else if (command.equalsIgnoreCase("register")) {
                RegisterPanel registerPanel = new RegisterPanel();
                input = scanner.nextLine();
                if (input.startsWith("create account "))
                    registerPanel.registerAccount(input);

            } else if (command.equalsIgnoreCase("")) {

            }
        }

        private static void help() {
            System.out.print("Register\n" +
                    "Login\n" +
                    "Sort by [filed]\n" +
                    "Help");
        }

    }

