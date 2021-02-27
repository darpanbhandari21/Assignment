package assignment5;

import java.util.Scanner;

public class FibonacciSeries {

    public void fibGenerator() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci series you want: ");
        int num = value.nextInt();
        System.out.println("The Fibonacci series is: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(n3 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        FibonacciSeries ob = new FibonacciSeries();
        ob.fibGenerator();
    }
}
