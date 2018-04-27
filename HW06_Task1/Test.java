/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Test {
    public static void main(String[] args) { 

    Quadrilateral quadrilateral = new Quadrilateral(2.2, 1.3, 6.6, 2.8, 6.4, 9.2, 3.2, 7.4); 
    Trapezoid trapezoid = new Trapezoid(0.0, 5.0, 9.0, 0.0, 8.0, 7.0, 6.3, 5.0); 
    Parallelogram parallelogram = new Parallelogram( 5.0, 9.0, 11.0, 4.0, 12.0, 5.0, 6.0, 21.0 ); 
    Rectangle rectangle = new Rectangle( 4.0, 15.0, 17.0, 14.0, 40.0, 28.0, 15.0, 28.0 ); 
    Square square = new Square( 4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );

    System.out.printf("%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram, rectangle, square );
    }
}
