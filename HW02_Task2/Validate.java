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
public class Validate {
    
    public static boolean vUserName(String uName){
        return uName.matches("^[a-z0-9_]*[^\\s]");
    }
    
    public static boolean vPassword(String uPass){
        return uPass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_])[a-zA-Z\\d_]{6,}$");
    }
    
    public static boolean vEmail(String eAdd){
        return eAdd.matches("^(.+)@(.+)$");
    }
    
    public static boolean vNumber(String pNum){
        return pNum.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
