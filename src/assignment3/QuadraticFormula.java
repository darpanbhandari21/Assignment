package assignment3;

import java.util.Scanner;

public class QuadraticFormula {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = value.nextDouble();
        System.out.println("Enter b: ");
        double b = value.nextDouble();
        System.out.println("Enter c: ");
        double c = value.nextDouble();

        double x = (-b + (Math.sqrt((b*b) - 4 * a * c))) / 2 * a;
        System.out.println("The value of x is: " + x);
    }
}
