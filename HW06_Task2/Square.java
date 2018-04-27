/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Square extends TwoDimensionalShape{

public Square( int x, int y, int side ){

    super( x, y, side, side );

}

public int getArea(){

     int area=getDim1()*getDim1();
     return area;

}

public String getName(){

     return "Square";

}

}
