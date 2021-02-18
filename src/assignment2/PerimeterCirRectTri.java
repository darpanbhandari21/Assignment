package assignment2;

import java.util.Scanner;

public class PerimeterCirRectTri {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);

        //Perimeter of Circle
        System.out.println("Enter the radius of circle(cm): ");
        int r = v.nextInt();
        final double PI_VALUE = 3.14;
        double perimeterCircle = 2 * PI_VALUE * r;
        System.out.println("The perimeter of circle is: " + perimeterCircle + " cm");

        //Perimeter of Rectangle
        System.out.println("Enter the length of rectangle(cm): ");
        int l = v.nextInt();
        System.out.println("Enter the width of rectangle(cm): ");
        int w = v.nextInt();
        int perimeterRectangle = 2 * (l + w);
        System.out.println("The perimeter of rectangle is: " + perimeterRectangle + " cm");

        //Perimeter of triangle
        System.out.println("Enter the first side of triangle(cm): ");
        int s1 = v.nextInt();
        System.out.println("Enter the second side of triangle(cm): ");
        int s2 = v.nextInt();
        System.out.println("Enter the third side of triangle(cm): ");
        int s3 = v.nextInt();
        int perimeterTriangle = s1 + s2 + s3;
        System.out.println("The perimeter of triangle is: " + perimeterTriangle + " cm");
    }
}
