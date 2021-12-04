package com.syntax.groupTask.Task4;
import java.util.Scanner;


public class RegistrationTester {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Registration register=new Registration();
        String userName;
        String password;
        String email;
        System.out.println("Enter your email address");
        email=input.nextLine();
        register.setEmail(email);
        System.out.println("Enter your user name");
        userName=input.nextLine();
        register.setUserName(userName);
        System.out.println("Enter your password");
        password=input.nextLine();
        register.setPassword(password);
    }
}
