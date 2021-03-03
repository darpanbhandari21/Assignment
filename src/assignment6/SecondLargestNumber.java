package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

    public void secLargest(int[] ar, Scanner val) {
        int secondLargest = 0;

        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            ar[i] = val.nextInt();
        }

        Arrays.sort(ar);

        for (int i = ar.length - 2; i >= 0; i--) { //starts from second last element as the largest element is at last
            if (ar[i] != ar[ar.length - 1]) {
                System.out.println("The second largest element is: " + ar[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        SecondLargestNumber ob = new SecondLargestNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        ob.secLargest(arr, input);
    }
}
