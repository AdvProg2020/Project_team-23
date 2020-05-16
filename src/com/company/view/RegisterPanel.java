package com.company.view;


import com.company.controller.RegisterAndLoginController;
import com.company.model.user.Roles;

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
        System.out.println("enter username: ");
        chooseUsername();

        System.out.println("enter first name and last name: ");
        enterFirstNameAndLastName();

        System.out.println("enter your Email: ");
        enterEmail();

        System.out.println("enter your phone: ");
        enterPhone();

        System.out.println("password: ");
        enterPassword();

        System.out.println("choose your role: seller or customer? ");

    }

    public void chooseUsername() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        username = "SaraZM200";
        registerAndLoginController.setUsername(username);
    }

    public void enterFirstNameAndLastName() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        firstName = "Sara";
        lastName = "Zahedi";
        registerAndLoginController.setFirstName(firstName);
        registerAndLoginController.setLastName(lastName);
    }

    public void enterEmail() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        Email = "sarazm@gmail.com";
        registerAndLoginController.setEmail(Email);
    }

    public void enterPhone() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        phone = "09121234567";
        registerAndLoginController.setPhone(phone);
    }

    public void enterPassword() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        password = "1234567";
        registerAndLoginController.setPassword(password);
    }

    public void chooseRole() {
        RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();
        while (true) {
            if (roles == Roles.CUSTOMER) {
                registerAndLoginController.setRoles(roles);
                break;
            } else if (roles == Roles.SELLER) {
                registerAndLoginController.setRoles(roles);
                break;
            } else {
                System.out.println("You must choose customer role or seller role! ");
                continue;
            }
        }
    }
}

