/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Trapezoid extends Quadrilateral
{
   private double height;

   public Trapezoid (double x1, double x2,
           double x3, double x4,
           double y1, double y2,
           double y3, double y4)
   {
       super (x1,x2,x3,x4,y1,y2,y3,y4);
   }

   public double getHeight()
   {
       if(getPoint1().getY() == getPoint2().getY())
           return Math.abs (getPoint2(). getY()-getPoint3().getY());
       else
           return Math.abs(getPoint1().getY()-getPoint2().getY());
   }

   public double getArea()
   {
       return getSumOfTwoSides() * getHeight()/ 2.0 ;
   }

   public double getSumOfTwoSides()
   {
       if(getPoint1().getY() == getPoint2().getY())
           return Math.abs(getPoint1().getX()-getPoint2().getX())
                   + Math.abs(getPoint3().getX()-getPoint4().getX());
       else
           return Math.abs(getPoint2().getX()-getPoint3().getX())
                   + Math.abs (getPoint4().getX()-getPoint1().getX());
   }

   @Override
   public String toString()
   {
       return String.format("\n%s%s\n%s%s\n%s%s"
               ,"Coordinates of Trapezoid are: ",
               super.getCoordinatesAsString(),
               "Height is : ", getHeight(),
               "Area is : ", getArea());
   }
}
