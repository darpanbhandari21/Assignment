package assignment2;

import java.util.Scanner;

public class TemperatureChange {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double tempC = t.nextDouble();
        double newF = (tempC * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is: " + newF);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double tempF = t.nextDouble();
        double newC = (tempF - 32) / 1.8;
        System.out.println("The temperature in Celsius is: " + newC);
    }
}
