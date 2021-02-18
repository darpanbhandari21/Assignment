package assignment2;

import java.util.Scanner;

public class AreaCirRectTri {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        //Area of Circle
        System.out.println("Enter the radius of circle(cm): ");
        int r = v.nextInt();
        final double VALUE_OF_PI = 3.14;
        double areaCircle = VALUE_OF_PI * r * r;
        System.out.println("The area of circle is: " + areaCircle + " sq.cm .");

        //Area of Rectangle
        System.out.println("Enter the length of rectangle(cm): ");
        int l = v.nextInt();
        System.out.println("Enter the width of rectangle(cm): ");
        int w = v.nextInt();
        int areaRectangle = l * w;
        System.out.println("The area of rectangle is: " + areaRectangle + " sq.cm .");

        //Area of triangle
        System.out.println("Enter the base of triangle(cm): ");
        int b = v.nextInt();
        System.out.println("Enter the height of triangle(cm): ");
        int h = v.nextInt();
        int areaTriangle = (b * h) / 2;
        System.out.println("The area of triangle is: " + areaTriangle + " sq.cm .");

    }
}
