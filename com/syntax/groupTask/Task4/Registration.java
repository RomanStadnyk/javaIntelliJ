package com.syntax.groupTask.Task4;

public class Registration {
    private String email;
    private String userName="";
    private String password="";

    public void setEmail(String email){
        if(email.contains("yahoo.com")){
            this.email=email;
        } else {
            System.out.println("Invalid email");
        }
    }
    public void setUserName(String userName){
        if(userName.length()<6){
            System.out.println("Username should have at least 6 characters. Try again.");
        } else {
            this.userName=userName;
        }
    }

    public void setPassword(String password){
        if(password.toLowerCase().contains(userName)||password.length()<6){
            System.out.println("Password cannot contain Username and be less then 6 characters. Try again.");
        } else {
            this.password=password;
        }
    }

}
