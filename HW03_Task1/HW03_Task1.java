/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03_task1;

/**
 *
 * @author pk
 */

import java.util.Scanner;

public class HW03_Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double s1;
        double s2;
        double s3;
        
        double s1Sq;
        double s2Sq;
        double s3Sq;
        
        System.out.print("Please enter side 1: ");
        s1 = input.nextDouble();
        
        System.out.print("Please enter side 2: ");
        s2 = input.nextDouble();
        
        System.out.print("Please enter side 3: ");
        s3 = input.nextDouble();
        
        s1Sq = s1 * s1;
        s2Sq = s2 * s2;
        s3Sq = s3 * s3;
        
        if((s1Sq + s2Sq) == s3Sq){
            System.out.print("These are the sides of a Right Triangle.\n");
        }else if((s1Sq + s3Sq) == s2Sq){
            System.out.print("These are the sides of a Right Triangle.\n");
        }else if((s2Sq + s3Sq) == s1Sq){
            System.out.print("These are the sides of a Right Triangle.\n");
        }else{
            System.out.print("These sides do not form a Right Triangle.\n");
        }
    }
    
}
