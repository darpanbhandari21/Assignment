package assignment4;

import java.util.Scanner;

public class NegativeNumber {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = value.nextDouble();

        if (num < 0) {
            System.out.println("The number you entered is negative: " + num);
        }
    }
}
