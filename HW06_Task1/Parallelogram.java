/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Parallelogram extends Trapezoid
{
public Parallelogram (double x1, double y1 , double x2, double y2, double x3, double y3,double x4, double y4)
{
    super(x1,y1,x2,y2,x3,y3,x4,y4);
}

public double getWidth()
{
    if(getPoint1().getY() == getPoint2().getY())
      return Math.abs (getPoint1().getX()-getPoint2().getX());
    else
      return Math.abs(getPoint2().getX()-getPoint3().getX());
}


//Returns the string of the Parallelogram object
@Override
public String toString()
{
    return String.format ("\n%s %s\n%s%s\n%s%s\n%s%s",
           "Coordinates of Parallelogram are" ,
           super.getCoordinatesAsString(),
           "Width is : ", getWidth(),
           "Height is : ", getHeight(),
           "Area is : ", getArea()
           );
};
}
