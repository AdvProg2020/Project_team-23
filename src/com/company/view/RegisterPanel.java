package com.company.view;


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
            this.Email = email;
            this.phone = phone;
            this.roles = roles;
        }

        private void getAdminInfo(){

        }

        private void getCostumerInfo(){

        }

        private void getSellerInfo(){

        }

        public void addNewAccount(){

        }


    }

