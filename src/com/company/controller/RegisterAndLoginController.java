package com.company.controller;

import com.company.model.user.Account;
import com.company.model.user.Roles;
import com.company.view.RegisterPanel;

import java.util.regex.Pattern;

public class RegisterAndLoginController {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String Email;
    private String phone;
    private Roles roles;
    private boolean isRegisterSuccessfully;

    public void setRegisterSuccessfully(boolean registerSuccessfully) {
        isRegisterSuccessfully = registerSuccessfully;
        if (isRegisterSuccessfully==false){
            duplicateUsernameError();
        }else {

        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
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

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public int login() {
        //return s.th
        return 0;
    }

    private void duplicateUsernameError(){
        RegisterPanel.printThisUsernameTaken();
    }

    public void addNewAccount(){
        Account account = new Account(username , password , firstName, lastName, Email, phone, roles);
       account.addNewUser(account);
        RegisterPanel.printSuccessfullyRegister();
    }

    public boolean register() {
        return false;
    }

    public void createAccount() {
    }

    public static boolean isUsernameValid(String username) {
        if ((Pattern.matches("\\w+", username)) && (username.length() >= 4)) {
            return true;
        }
        return false;
    }

    public static boolean isNameValid(String name) {
        if ((Pattern.matches("\\w+", name)) && (name.length() >= 1)) {
            return true;
        }
        return false;
    }

    public static boolean isPasswordValid(String password) {
        if ((Pattern.matches("(\\w+)|(\\d+)", password)) && (password.length() >= 8)) {
            return true;
        }
        return false;
    }

    public static boolean isEmailAddressValid(String emailAddress) {
        if ((Pattern.matches("((\\w+\\.?\\w*@\\w+)\\.com)", emailAddress))) {
            return true;
        }
        return false;
    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        if (Pattern.matches("0(\\d+)", phoneNumber) && phoneNumber.length() == 11) {
            return true;
        } else {
            return false;
        }
    }
}

