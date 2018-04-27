/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_task1;

/**
 *
 * @author pk
 */
public class TestRectangle {
    
    public static void main(String[] args){
    
    Rectangle rect1 = new Rectangle();
    Rectangle rect2 = new Rectangle(5.8, 6.4, "blue");
    
    rect1.toString();
    System.out.printf("%nThe Area is %.2f%nThe Perimeter is %.2f%n"
            , rect1.calculateArea(), rect1.calculatePerimeter());
    
    rect2.toString();
    System.out.printf("%nThe Area is %.2f%nThe Perimeter is %.2f%n"
            , rect2.calculateArea(), rect2.calculatePerimeter());
}
    
}
