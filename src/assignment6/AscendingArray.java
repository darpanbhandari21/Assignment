package assignment6;

import java.util.Scanner;

public class AscendingArray {

    public void ascArray(int[] ar, Scanner val) {
        int temp = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            ar[i] = val.nextInt();
        }

        System.out.println("Array in original order is: ");
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        System.out.println("\nArray in ascending order is: ");
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        AscendingArray ob = new AscendingArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        ob.ascArray(arr, input);

    }
}
