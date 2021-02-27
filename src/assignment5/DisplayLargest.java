package assignment5;

import java.util.Scanner;

public class DisplayLargest {

    public void chooseLargest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNum = input.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNum = input.nextDouble();
        System.out.println("Enter the third number: ");
        double thirdNum = input.nextDouble();

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println(firstNum + " is the largest.");
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println(secondNum + " is the largest.");
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println(thirdNum + " is the largest.");
        } else {
            System.out.println("All numbers are equals and are the largest.");
        }
    }

    public static void main(String[] args) {
        DisplayLargest obj = new DisplayLargest();
        obj.chooseLargest();
    }
}
