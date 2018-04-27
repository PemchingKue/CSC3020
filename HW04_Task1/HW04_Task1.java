/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04_task1;

/**
 *
 * @author pk
 */
import java.util.Scanner;
public class HW04_Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];

        int count = 0; 
        int x = 0;
        int num;

        while (x < a.length) {
            System.out.print("Enter number: ");
            num = input.nextInt();

            if ((num >= 1) && (num <= 100)) {
                boolean digit = false;
                x++;
                
                    for (int i = 0; i < a.length; i++) 
                     {   if (a[i] == num)     
                         digit = true;
                     }  

                if (!digit) {
                        a[count] = num;
                        count++;
                }
            }else
                    System.out.printf("The number must be between 1 and 100 \n");
            
            for(int i =0;  i < x; i++) {
                if(a[i]!=0){
                    System.out.print(a[i] +" ");
                }
            }
            
            System.out.print("\n");
            
        } 
    }
}
