package com.company.controller;

import com.company.model.user.Roles;

public class RegisterAndLoginController {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String Email;
    private String phone;
    private Roles roles;

    public void setUsername(String username) {
        this.username = username;
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

        public boolean register() {
            return false;
        }

        public void createAccount() {}
    }

