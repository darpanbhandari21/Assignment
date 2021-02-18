package assignment1;

import java.util.Scanner;

public class Sum_Average {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = value.nextInt();
        System.out.println("Enter the second number: ");
        int b = value.nextInt();

        int sum = a + b;
        int avg = sum / 2;

        System.out.println("Sum of two numbers is: "+sum);
        System.out.println("Average of two numbers is: "+avg);
    }
}
