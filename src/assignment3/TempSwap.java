package assignment3;

import java.util.Scanner;

public class TempSwap {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = value.nextDouble();
        System.out.println("Enter y: ");
        double y = value.nextDouble();

        double temp = x ;
        x = y;
        y = temp;

        System.out.println("The values of x and y after swapping are: ");
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}
