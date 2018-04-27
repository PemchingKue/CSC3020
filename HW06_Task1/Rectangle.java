/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Rectangle extends Parallelogram
{
public Rectangle ( double x1, double y1,
          double x2, double y2,
          double x3, double y3,
          double x4, double y4)
{
    super(x1,y1,x2,y2,x3,y3,x4,y4);
}
   @Override
   public String toString()
   {
     return String.format ("\n%s %s\n%s%s\n%s%s\n%s%s ",
           "Coordinates of Rectangle are",
           super.getCoordinatesAsString(),
             "Width is : ", getWidth(),
             "Height is : " ,getHeight(),
             "Area is : " ,getArea());
   }
}
