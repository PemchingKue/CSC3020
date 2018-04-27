/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author pk
 */

import java.util.Scanner;

public class HW01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        
        int sum;
        float avg;
        
        System.out.print("Enter Ethan's hours: ");
        num1 = input.nextInt();
        
        System.out.print("Enter Lucas's hours: ");
        num2 = input.nextInt();
        
        System.out.print("Enter Liam's hours: ");
        num3 = input.nextInt();
        
        System.out.print("Enter Olivia's hours: ");
        num4 = input.nextInt();
        
        System.out.print("Enter Isla's hours: ");
        num5 = input.nextInt();
        
        System.out.println();
        sum = num1 + num2 + num3 + num4 + num5;
        avg = sum / 5;
        
        System.out.println("Name \t\t Hours");
        System.out.println("----------------------");
        System.out.printf("Ethan \t\t %d \n", num1);
        System.out.printf("Lucas \t\t %d \n", num2);
        System.out.printf("Liam \t\t %d \n", num3);
        System.out.printf("Olivia \t\t %d \n", num4);
        System.out.printf("Isla \t\t %d \n", num5);
        System.out.println("----------------------");
        System.out.printf("Total \t\t %d \n", sum);
        System.out.printf("Average \t %.2f \n", avg);
    
    }
    
}
