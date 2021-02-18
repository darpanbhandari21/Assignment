package assignment2;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int P = value.nextInt();
        System.out.println("Enter the time given: ");
        int T = value.nextInt();
        System.out.println("Enter the rate of interest: ");
        int R = value.nextInt();

        int I = (P * T * R) / 100;
        System.out.println("The Simple Interest of the amount is: " + I);
    }
}
