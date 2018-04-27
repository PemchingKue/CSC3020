/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04_task3;

/**
 *
 * @author pk
 */
import java.util.Scanner;
public class HW04_Task3 {

public static double cDistance(double x1, double y1, double x2, double y2){
    
       return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2),2));
       
}

public static void main(String[] args) {
    double x1;
    double y1;
    double x2;
    double y2;
    
    Scanner input = new Scanner(System.in);
    double distance;
    
        System.out.print("Enter x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        y2 = input.nextDouble();
        distance = cDistance(x1, y1, x2, y2);
        System.out.println("The distance between points " + "(" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);

    }
    
}
