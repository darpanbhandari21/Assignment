package assignment2;

import java.util.Scanner;

public class PoundToKg {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        double weightPound = w.nextDouble();
        double weightKg = weightPound * 0.454;

        System.out.println("The desired weight in kg is: " + weightKg);

    }
}
