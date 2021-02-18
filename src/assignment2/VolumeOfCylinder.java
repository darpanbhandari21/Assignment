package assignment2;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder(cm): ");
        int r = v.nextInt();
        System.out.println("Enter the length of cylinder(cm): ");
        int l = v.nextInt();
        final double VALUE_OF_PI = 3.14;
        double volCylinder = VALUE_OF_PI * r * r * l;
        System.out.println("The volume of the cylinder is: " + volCylinder);
    }
}
