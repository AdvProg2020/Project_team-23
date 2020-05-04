package com.company.view;

import com.company.model.user.Roles;

    public class LoginAndRegister extends Menu {
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String Email;
        private String phone;
        private Roles roles;

        public LoginAndRegister(String username, String password, String firstName, String lastName, String email, String phone, Roles roles) {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.Email = email;
            this.phone = phone;
            this.roles = roles;
        }
        public static void run(){

        }
        private boolean isUsernameExist(String input){
            //foreach in all user name
            return true;
        }

        private boolean canUserAddAdmin(){
            if (roles.equals(Roles.ADMIN)){
                return true;
            }
            return false;
        }
        private void getAdminInfo(){

        }

        private void getCustomerInfo(){

        }

        private void getSellerInfo(){

        }

        private void addAdmin(){
            if (canUserAddAdmin()==true){
                //add this user in admins list
            }else
                System.out.println("Error! Only admins can create an admin.");
        }

        public void addNewAccount(String command){
            String[] word = command.split(" ");
            if (isUsernameExist(word[3])==false){
                //add the user in Array list
            }
            if (isUsernameExist(word[3])==true){
                System.out.println("Error! This username is already exist.");
            }
        }

        public static void loginUser(String input){
            String[] word = input.split(" ");
        }


    }
