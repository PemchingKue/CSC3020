/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Cube extends ThreeDimensionalShape{

public Cube( int x, int y, int side ){

    super(x, y, side, side, side);

}

public String getName(){

     return "Cube";

}

public int getArea(){

     int area=6*getDim1()*getDim1();
     return area;

}

public int getVolume(){

     int vol=getDim1()*getDim1()*getDim1();
     return vol;

}

}
