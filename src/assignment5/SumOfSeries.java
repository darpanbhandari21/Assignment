package assignment5;

import java.util.Scanner;

public class SumOfSeries {

    public void seriesSum() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        int n = value.nextInt();

        double res = 0;
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            res = res + (i / fact);
        }
        System.out.println("The sum of the series is: " + res);
    }

    public static void main(String[] args) {
        SumOfSeries ob = new SumOfSeries();
        ob.seriesSum();
    }
}
