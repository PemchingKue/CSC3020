/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Sphere extends ThreeDimensionalShape{

public Sphere( int x, int y, int radius ){

     super(x, y, radius, radius, radius);

}

public int getArea(){

     int area=(int) (4*Math.PI*getDim1()*getDim1());
     return area;

}

public int getVolume(){

     int vol=(int)( ((double)4/3)*Math.PI*getDim1()*getDim1()*getDim1());
     return vol;

}

public String getName(){

     return "Sphere";

}

}
