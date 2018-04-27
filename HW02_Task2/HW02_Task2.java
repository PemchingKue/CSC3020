/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_task2;

/**
 *
 * @author pk
 */

import java.util.Scanner;

public class HW02_Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String userName;
        String password;
        String eAddress;
        String pNumber;
        
        System.out.print("Please enter username: ");
        userName = input.nextLine();
        
        System.out.print("Please enter password: ");
        password = input.nextLine();
        
        System.out.print("Please enter email address: ");
        eAddress = input.nextLine();
        
        System.out.print("Please enter phone number: ");
        pNumber = input.nextLine();
        
        System.out.printf("%n");
        
        if (Validate.vUserName(userName)){
        System.out.printf("Valid username!%n");
        }else{
        System.out.printf("Invalid username!%n");
        }
        
        if (Validate.vPassword(password)){
        System.out.printf("Valid password!%n");
        }else{
        System.out.printf("Invalid password!%n");
        }
        
        if (Validate.vEmail(eAddress)){
        System.out.printf("Valid email address!%n");
        }else{
        System.out.printf("Invalid email address!%n");
        }
        
        if (Validate.vNumber(pNumber)){
        System.out.printf("Valid phone number!%n");
        }else{
        System.out.printf("Invalid phone number!%n");
        }
    }
    
}
