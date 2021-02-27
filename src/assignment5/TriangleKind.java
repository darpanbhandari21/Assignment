package assignment5;

import java.util.Scanner;

public class TriangleKind {

    public void chooseTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        float firstSide = input.nextFloat();
        System.out.println("Enter the second side: ");
        float secondSide = input.nextFloat();
        System.out.println("Enter the third side: ");
        float thirdSide = input.nextFloat();


        if (firstSide >= (secondSide + thirdSide) || thirdSide >= (secondSide + firstSide) || secondSide >= (firstSide + thirdSide)) {
            System.out.println("This is not a Triangle.");
        } else if (firstSide == secondSide && secondSide == thirdSide) {
            System.out.println("The triangle is an Equilateral triangle.");
        } else if (((firstSide * firstSide) + (secondSide * secondSide)) == (thirdSide * thirdSide) || ((firstSide * firstSide) + (thirdSide * thirdSide)) == (secondSide * secondSide) || ((thirdSide * thirdSide) + (secondSide * secondSide)) == (firstSide * firstSide)) {
            System.out.println("The triangle is a Right Angle triangle");
        } else if (firstSide != secondSide && secondSide != thirdSide && thirdSide != firstSide) {
            System.out.println("The triangle is a Scalene triangle.");
        } else if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide) {
            System.out.println("The triangle is an Isosceles triangle.");
        }
    }

    public static void main(String[] args) {
        TriangleKind ob = new TriangleKind();
        ob.chooseTriangle();
    }
}