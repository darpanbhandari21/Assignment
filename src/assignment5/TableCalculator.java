package assignment5;

import java.util.Scanner;

public class TableCalculator {

    public void mulOperation() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number you want table for: ");
        double num = value.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        TableCalculator ob = new TableCalculator();
        ob.mulOperation();
    }
}
