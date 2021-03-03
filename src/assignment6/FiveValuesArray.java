package assignment6;

import java.util.Scanner;

public class FiveValuesArray {

    public void sumOfArray(int[] ar, Scanner val) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            ar[i] = val.nextInt();
            sum += ar[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[] arr = new int[5];

        FiveValuesArray ob = new FiveValuesArray();
        ob.sumOfArray(arr, value);

    }
}
