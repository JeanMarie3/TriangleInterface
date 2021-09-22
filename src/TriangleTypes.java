/*
A program reads three integer values from an interface.
The three values are interpreted as representing the lengths of the sides of a triangle.
The program prints a message that states whether the triangle is scalene, isosceles, or equilateral.
·         Write a program according to above requirements.
.         Write set of test cases (specific sets of data) that you feel would adequately test this program.
 */

import java.util.Scanner;

public interface TriangleTypes {

    //Change the lengths of Triangle sides to Print scalene or isosceles or equilateral
    int TriangleSideA = 9;
    int TriangleSideB = 9;
    int TriangleSideC = 9;

}

class TriangleType {

    public void TriangleEquilateral(){
            System.out.println("Triangle is equilateral");
    }

    public void TriangleIsosceles(){
            System.out.println("Triangle is isosceles");
    }

    public void TriangleScalene(){
            System.out.println("Triangle is scalene");
    }
}

class Solution implements TriangleTypes{
    public static void main(String[] args) {

            TriangleType Triangle = new TriangleType();

            if (TriangleSideA == TriangleSideB && TriangleSideB == TriangleSideC && TriangleSideA == TriangleSideC)
            {
                Triangle.TriangleEquilateral();
            }
            else if (TriangleSideA != TriangleSideB && TriangleSideB != TriangleSideC && TriangleSideA != TriangleSideC)
            {
                Triangle.TriangleScalene();
            }
            else
            {
                Triangle.TriangleIsosceles();
            }
    }
}



