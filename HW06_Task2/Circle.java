/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Circle extends TwoDimensionalShape{

public Circle( int x, int y, int radius ){

    super( x, y, radius, radius );

}

public String getName(){

     return "Circle";

}

public int getArea(){

     int area=(int) (Math.PI*getDim1()*getDim1());
     return area;

}

}
