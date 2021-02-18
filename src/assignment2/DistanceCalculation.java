package assignment2;

import java.util.Scanner;

public class DistanceCalculation {

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter the initial velocity of the vehicle(m/s): ");
        double u = val.nextDouble();
        System.out.println("Enter the acceleration of the vehicle(m/sec.square): ");
        double a = val.nextDouble();
        System.out.println("Enter the time required to travel the distance(s): ");
        double t = val.nextDouble();

        double s = (u * t) + ((a * t *t) / 2);
        System.out.println("The distance travelled by the vehicle is: " + s);

    }
}
