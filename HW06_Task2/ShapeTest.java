/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pk
 */
public class ShapeTest{

public static void main( String args[] ){

Shape shapes[] = new Shape[4];
shapes[0] = new Circle(65, 38, 7);
shapes[1] = new Square(12, 56, 10);
shapes[2] = new Sphere(7, 35, 3);
shapes[3] = new Cube(75, 54, 18);

for (Shape currentShape : shapes){

    System.out.printf( "%s: %s",currentShape.getName(), currentShape );
    
    if (currentShape instanceof TwoDimensionalShape){
        
    TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) currentShape;
    System.out.printf( "%s's area is %s\n",
    currentShape.getName(), twoDimensionalShape.getArea() );
    
    }

    if (currentShape instanceof ThreeDimensionalShape){
        
    ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) currentShape;
    System.out.printf("%s's area is %s\n", currentShape.getName(), threeDimensionalShape.getArea());

    System.out.printf("%s's volume is %s\n", currentShape.getName(), threeDimensionalShape.getVolume());

    }

    System.out.println();

        }
    }
}
