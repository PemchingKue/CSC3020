/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class IntegerSet {

    private final int SIZE=101;
    private boolean [ ] set;
    
    public IntegerSet(){
        set = new boolean[SIZE];
    }
    
    public IntegerSet (int array[]){
        set = new boolean[SIZE];
        for(int i=0; i<array.length; i++){
            insertElement(array[i]);
        }
    }
    
    public String toString(){
        int x = 1;
        boolean empty = true;
        String setString = " { ";
        
        for(int count = 0; count < 101; count++){
            if(set[count]){
                setString+=count+" ";
                empty = false;
                x++;
            }
        }
        if(empty)
            setString+="___";
        setString+="}";
    return setString;  
 
    }
    
    public IntegerSet union(IntegerSet integerSet){
        IntegerSet temp = new IntegerSet();
        for(int count = 0; count<101; count++){
            temp.set[count] = (set[count] || integerSet.set[count]);
        }
        return temp;
    }
    
    public IntegerSet intersection(IntegerSet integerSet){
        IntegerSet temp = new IntegerSet();
        for(int count = 0; count<101; count++){
            temp.set[count] = (set[count] && integerSet.set[count]);
        }
        return temp;
    }
    
    public void insertElement(int insertInteger){
        if(validEntry(insertInteger)) 
            set[insertInteger] = true;
    }
    
    public void deleteInteger(int deleteInteger){
        if(validEntry(deleteInteger))
            set[deleteInteger] = false;
    }
    
    public boolean isEqualTo(IntegerSet integerSet){
        for(int count=0; count<101; count++){
            if(set[count]!=integerSet.set[count]){
                return false;
            }
        }
        return true;
    }
    
    public boolean validEntry(int input){
        return input>=0 && input<=100;
    }
    
}
