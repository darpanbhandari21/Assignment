package assignment5;

import java.util.Scanner;

public class FactorialOfNum {

    public void factorialCalc() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the required number: ");
        int num = value.nextInt();

        int fact1 = 0;
        int fact2 = 1;

        if (num == 0) {
            System.out.println("The factorial of 0 is: 1");
        } else {
            System.out.println("The required factorial numbers are: ");
            for (int i = 1; i <= num; i++) {
                fact1 = i;
                System.out.print(fact1 + " ");
                fact2 *= i;
            }
            System.out.println("\nThe factorial of the number is: " + fact2);

        }
    }

    public static void main(String[] args) {
        FactorialOfNum ob = new FactorialOfNum();
        ob.factorialCalc();
    }
}
