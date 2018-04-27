/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04_task2;

/**
 *
 * @author pk
 */
public class HW04_Task2 {

public static int product(int... numbers){
    int product = 1;
    
    for (int number : numbers){
    product *= number;
    }
    
    return product;
}

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 9;
        int d = 4;
        int e = 7;
        
        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %d\n\n",
        a, b, c, d, e);
        
        System.out.printf("The product of a and b is: %d\n",
        product(a, b));
        
        System.out.printf("The product of a, b and c is: %d\n",
        product(a, b, c));
        
        System.out.printf("The product of a, b, c and d is: %d\n",
        product(a, b, c, d));
        
        System.out.printf("The product of a, b, c, d and e is: %d\n",
        product(a, b, c, d, e));
    }
    
}
