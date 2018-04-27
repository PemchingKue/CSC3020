/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class Square extends Parallelogram
{
public Square (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
{
      //calling base class Parallelogram
    super(x1,y1,x2,y2,x3,y3,x4,y4);
}


//returns the string representation of Parallelogram class object
@Override
public String toString()
{
    return String.format ("\n%s %s\n%s%s\n%s%s ",
        "Coordinates of Square are",
        super.getCoordinatesAsString(),
            "Side is : " ,getWidth(),           
            "Area is : " ,getArea());
}

}
