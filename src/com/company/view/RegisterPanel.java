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
        this.roles = Roles.GUEST;
    }

    public RegisterPanel() {

    }

    public void registerAccount(String str) {
        String word[] = str.split(" ");
        //word[2] = type
        //word[3] = username
        if (word[2].equalsIgnoreCase("seller")){
            roles = Roles.SELLER;
            chooseRole(roles);
        }else if (word[2].equalsIgnoreCase("customer")){
            roles = Roles.CUSTOMER;
            chooseRole(roles);
        }
    }

    public void chooseUsername(String input) {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();

        while (true) {
            System.out.println("enter username: ");
            if (registerAndLoginController.isUsernameValid(input) == true) {
                registerAndLoginController.setUsername(input);
                System.out.println(input);
                enterPassword();
                break;

            } else {
                System.out.println("You can use digit and number! Don't use others character like @,!,... .");
                continue;
            }
        }
    }

    public void enterFirstNameAndLastName() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        String input;
        Scanner sc = new Scanner(System.in);
        String name[] = new String[2];
        while (true) {
            System.out.println("Enter first name : ");
            input = sc.nextLine();
            name[0] = input;
            if (registerAndLoginController.isNameValid(name[0]) == true) {
                registerAndLoginController.setFirstName(input);
                break;
            }else {
                continue;
            }
        }
        while (true) {
            System.out.println("Enter last name : ");
            input = sc.nextLine();
            name[1] = input;
            if (registerAndLoginController.isNameValid(name[1]) == true) {
                registerAndLoginController.setLastName(input);
                break;
            }else {
                continue;
            }
        }
        System.out.println("firstName: " + name[0] + ", lastName: " + name[1]);
        enterEmail();
    }

    public void enterEmail() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter your Email: ");
            String input = sc.nextLine();
            if (registerAndLoginController.isEmailAddressValid(input) == true) {
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
        while (true) {
            System.out.println("enter your phone: ");
            String input = sc.nextLine();
            if (registerAndLoginController.isPhoneNumberValid(input) == true) {
                registerAndLoginController.setPhone(input);
                System.out.println("phone: " + input);
                registerAndLoginController.addNewAccount();
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
        while (true) {
            System.out.println("Set your password: ");
            String input = sc.nextLine();
            if (registerAndLoginController.isPasswordValid(input) == true) {
                registerAndLoginController.setPassword(input);
                System.out.println("password: " + input);
                enterFirstNameAndLastName();
                break;
            } else {
                System.out.println("you can use just letter and number and '.' character! must use at least 8 character. ");
                continue;
            }
        }
    }

    public void chooseRole(Roles role) {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        registerAndLoginController.setRoles(role);
    }

    public static void printThisUsernameTaken(){
        System.out.println("This username was taken");
    }

    public static void printSuccessfullyRegister(){
        System.out.println("Successfully Register :) ");
    }

}

