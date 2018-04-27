/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public abstract class TwoDimensionalShape extends Shape{

private int dimension1;
private int dimension2;

public TwoDimensionalShape(int x, int y, int d1, int d2){

    super(x, y);

    dimension1 = d1;
    dimension2 = d2;

}

public int getDim1(){

     return dimension1;

}

public int getDim2(){

     return dimension2;

}

public abstract int getArea();

}
