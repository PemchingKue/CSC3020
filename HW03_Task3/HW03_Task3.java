/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03_task3;

/**
 *
 * @author pk
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW03_Task3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first string: ");
        inputString = input.nextLine();
        
        StringTokenizer tokens = new StringTokenizer(inputString, " ");
        
        while(tokens.hasMoreTokens()){
            String test = tokens.nextToken();
            if(test.endsWith("ED")){
                System.out.println(test + "\n");
            }
        }
    }
    
}
