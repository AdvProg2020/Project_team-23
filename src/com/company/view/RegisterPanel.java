package com.company.view;

import com.company.controller.RegisterAndLoginController;
import com.company.model.user.Roles;
import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;
import org.omg.CORBA.MARSHAL;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterPanel extends Menu {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String Email;
    private String phone;
    private Roles roles;

    public RegisterPanel(String username, String password, String firstName, String lastName, String email, String phone, Roles roles) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
        this.phone = phone;
        this.roles = roles;
    }

    public RegisterPanel() {

    }

    public void registerAccount() {
        chooseUsername();
    }

    private boolean isCorrectPattern(String input, String patternCorrect) {
        Pattern pattern = Pattern.compile(patternCorrect);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public void chooseUsername() {
        String userNamePattern = "(\\D*)(\\d*)";
        Scanner sc = new Scanner(System.in);
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();

        while (true) {
            System.out.println("enter username: ");
            String input = sc.nextLine();
            if (isCorrectPattern(input, userNamePattern) == true) {
                registerAndLoginController.setUsername(input);
                System.out.println(input);
                enterFirstNameAndLastName();
                break;

            } else {
                System.out.println("You can use digit and number! Don't use others character like @,!,... .");
                continue;
            }
        }
    }

    public void enterFirstNameAndLastName() {
        System.out.println("Enter first name : ");
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String name[] = new String[2];
        String input = sc.nextLine();
        name[0] = input;
        registerAndLoginController.setFirstName(input);
        System.out.println("Enter last name : ");
        registerAndLoginController.setLastName(input);
        name[1] = input;
        System.out.println("firstName: " + name[0] + ", lastName: " + name[1]);

        enterEmail();
    }

    public void enterEmail() {
        String emailPattern = "(((\\D*)(\\d*)(\\.*))@(\\D+).com)";
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (true) {
            System.out.println("enter your Email: ");
            if (isCorrectPattern(input, emailPattern) == true) {
                registerAndLoginController.setEmail(input);
                System.out.println("Email: " + input);
                enterPhone();
                break;
            } else {
                System.out.println("invalid email! Try again! ");
                continue;
            }

        }


    }

    public void enterPhone() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String phonePattern = "(0(\\d+))";
        while (true) {
            System.out.println("enter your phone: ");
            String input = sc.nextLine();
            if (isCorrectPattern(input, phonePattern)) {
                registerAndLoginController.setPhone(input);
                System.out.println("phone: " + input);
                enterPassword();
                break;
            } else {
                System.out.println("Please enter a valid phone number! ");
                continue;
            }
        }
    }

    public void enterPassword() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String passwordPattern = "((\\d+)(\\D+)(\\.*))";
        while (true) {
            System.out.println("Set your password: (you must have at least a number and a letter) ");
            String input = sc.nextLine();
            if (isCorrectPattern(input, passwordPattern) == true) {
                registerAndLoginController.setPassword(input);
                System.out.println("password: " + input);
                chooseRole();
                break;
            } else {
                System.out.println("you can use just letter and number and '.' character! ");
                continue;
            }
        }
    }

    public void chooseRole() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("choose your role: seller or customer? ");
            String input = sc.nextLine();
            if ((input.equalsIgnoreCase("customer")) || ((input.equalsIgnoreCase("seller")))) {
                registerAndLoginController.setRoles(roles);
                break;
            } else {
                System.out.println("You must choose seller or customer role! ");
                continue;
            }
        }
    }
}

