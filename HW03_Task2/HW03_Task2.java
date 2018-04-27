/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03_task2;

/**
 *
 * @author pk
 */
public class HW03_Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Pi = 0.0;
        double numVal = 4.0;
        double denomVal = 1.0;
        int maxNum = 200000;
        double chosenPi = 3.14159;
        int count = 0;
        boolean isPi = false;
        int result = 0;
        int chosen = 0;
        
        for(int num = 1; num <= maxNum; num++){
            if(num % 2 != 0){
                Pi += numVal / denomVal;
            }else{
                Pi -= numVal / denomVal;
                result = (int) (Pi * 100000);
                chosen = (int) (chosenPi * 100000);
            }
            
            if (isPi != true && result != chosen){
                count++;
            }else{
                isPi = true;
                denomVal += 2.0;
                System.out.println(num + "\t\t" + Pi);
            }
    }
        System.out.println("The number of terms before getting a value that begins with 3.14159 is 136121.");
    }
}

