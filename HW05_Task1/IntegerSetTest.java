/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
import java.util.Scanner;

public class IntegerSetTest {
    
    public static void main(String args[]){
        
        System.out.println("Input Set A");
        IntegerSet set1 = inputSet();
        
        System.out.println("Input Set B");
        IntegerSet set2 = inputSet();
        
        IntegerSet union = set1.union(set2);
        IntegerSet intersection = set1.intersection(set2);
        
        System.out.println("Set A contains elements:");
        System.out.println(set1.toString());
        System.out.println("Set B contains elements:");
        System.out.println(set2.toString());
        
        System.out.println("Union of set A and set B contains elements:");
        System.out.println(union.toString());
        System.out.println("Intersection of set A and Set B contains elements:");
        System.out.println(intersection.toString());
        
        if(set1.isEqualTo(set2)){
            System.out.println("Set A is equal to set B");
        }else{
            System.out.println("Set A is not equal to set B");
        }
        
        System.out.println("Inserting 45 into set A");
        set1.insertElement(45);
        System.out.println("Set A now contains elements: ");
        System.out.println(set1.toString());
        System.out.println("Deleting 45 from set A");
        set1.deleteInteger(45);
        System.out.println("Set A now contains elements: ");
        System.out.println(set1.toString());
        
        int intArray[] = {34,54,65,23,12,-6,9,234,65,1};
        IntegerSet set4 = new IntegerSet(intArray);
        System.out.println("New set contains elements: ");
        System.out.println(set4.toString());
        
    }
    
    private static IntegerSet inputSet(){
        Scanner input = new Scanner(System.in);
        IntegerSet temp = new IntegerSet();
        System.out.println("Enter a number to insert into the Set (-1 to stop): ");
        int number = input.nextInt();
        while(number != -1){
            temp.insertElement(number);
            System.out.println("Enter a number to insert into the Set (-1 to stop): ");
            number = input.nextInt();
        }
        return temp;
    }
    
}
