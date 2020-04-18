package com.company.view;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class CommandPro {
        private String command;


        public CommandPro(String command) {
            this.command = command;
        }

        public String getCommand() {
            return command;
        }

        public static void recognizeCommand(String command) {
            String commandPattern = null;
            Pattern pattern = Pattern.compile(commandPattern);
            Matcher matcher = pattern.matcher(command);
            //we have to define patterns for commands then
            //if command matches with a pattern we run the command
            if (command.equalsIgnoreCase("help")) {
                help();
            } else if (command.equalsIgnoreCase("sort by ")) {


            } else if (command.equalsIgnoreCase("login")) {

            } else if (command.equalsIgnoreCase("register")) {

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

