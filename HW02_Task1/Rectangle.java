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
public class Rectangle {
    
    private double side1;
    private double side2;
    private String color;
    
    public Rectangle(){
    side1 = 1.0;
    side2 = 1.0;
    color = "white";
    }
    public Rectangle(double s1, double s2, String C){
        side1 = s1;
        side2 = s2;
        color = C;
    }
    
    public void setSide1(double s1){
        side1 = s1;
    }
    public double getSide1(double s1){
        return s1;
    }
    
    public void setSide2(double s2){
        side1 = s2;
    }
    public double getSide2(double s2){
        return s2;
    }
    
    public void setColor(String C){
        color = C;
    }
    public String getColor(String C){
        return C;
    }
    
    public double calculateArea(){
        double area;
        area = side1 * side2;
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter;
        perimeter = side1 + side2;
        return perimeter;
    }
    
    @Override
    public String toString(){
        System.out.printf("Rectangle: first two sides = %.2f "
                + "and the other two sides =  %.2f, Color: %s ", side1, side2, color);
        return null;
    }
}
