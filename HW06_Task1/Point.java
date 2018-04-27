/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Point
{
   private double x;
   private double y;

   //two arguement constructor
   public Point (double xCoordinate, double yCoordinate)
   {
       x = xCoordinate;
       y = yCoordinate;
   }

   public double getX()
   {
       return x;
   }
   public double getY()
   {
       return y;
   }

   //Returns string of Point class object
   @Override
   public String toString()
   {
       return String.format( "(%2.1f,%2.1f)", getX(), getY());
   }
}
