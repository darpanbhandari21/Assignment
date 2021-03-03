package assignment6;

import java.util.Scanner;

public class ReverseArray {

    //Reverses an integer value
    public void revNumberArray(int[] ar, Scanner val) {
        System.out.println("***Reverse an Integer***");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            ar[i] = val.nextInt();
        }

        System.out.println("\nArray in original order is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println("\nArray in reverse order is: ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\n");
    }

    //Reverses a string value
    public void revWordArray(String[] ar, Scanner val) {
        System.out.println("***Reverse a String***");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            ar[i] = val.next();
        }

        System.out.println("\nArray in original order is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println("\nArray in reverse order is: ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        ReverseArray ob = new ReverseArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        String[] ar = new String[size];
        ob.revNumberArray(arr, input);
        ob.revWordArray(ar, input);
    }
}
