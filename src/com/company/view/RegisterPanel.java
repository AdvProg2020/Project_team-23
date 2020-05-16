package com.company.view;

import com.company.controller.RegisterAndLoginController;
import com.company.model.user.Roles;
import java.util.Scanner;

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

    public void chooseUsername() {
        System.out.println("enter username: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        registerAndLoginController.setUsername(input);
        System.out.println(input);

        enterFirstNameAndLastName();
    }

    public void enterFirstNameAndLastName() {
        System.out.println("enter first name and last name: ");
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String name[] = input.split("\\s+");
        registerAndLoginController.setFirstName(name[0]);
        registerAndLoginController.setLastName(name[1]);
        System.out.println("firstName: " + name[0] + ", lastName: " + name[1]);

        enterEmail();
    }

    public void enterEmail() {
        System.out.println("enter your Email: ");
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        registerAndLoginController.setEmail(input);
        System.out.println("Email: " + input);

        enterPhone();
    }

    public void enterPhone() {
        System.out.println("enter your phone: ");
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        registerAndLoginController.setPhone(input);
        System.out.println("phone: " + input);

        enterPassword();
    }

    public void enterPassword() {
        System.out.println("password: ");
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        registerAndLoginController.setPassword(input);
        System.out.println("password: " + input);

        chooseRole();
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
            }else {
                System.out.println("You must choose seller or customer role! ");
                continue;
            }
        }
    }
}

