package assignment4;

import java.util.Scanner;

public class RelateIntegers {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNum = value.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNum = value.nextDouble();

        if (firstNum > secondNum) {
            System.out.println(firstNum + " is greater than " + secondNum);
        } else if (secondNum > firstNum) {
            System.out.println(secondNum + " is greater than " + firstNum);
        } else if (firstNum == secondNum){
            System.out.println(firstNum + " is equal to " + secondNum);
        }
    }
}