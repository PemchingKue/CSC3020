/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public abstract class ThreeDimensionalShape extends Shape{

private int dimension1;
private int dimension2;
private int dimension3;

public ThreeDimensionalShape(int x, int y, int d1, int d2, int d3 ){

    super( x, y );

    dimension1 = d1;
    dimension2 = d2;
    dimension3 = d3;

}

public int getDim1(){

     return dimension1;

}

public int getDim2(){

     return dimension2;

}

public int getDim3(){

     return dimension3;

}

public abstract int getArea();
public abstract int getVolume();

}