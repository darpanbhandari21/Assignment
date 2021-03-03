package assignment6;

import java.util.Scanner;

public class FindDuplicate {

    public void sortDuplicate(int[] ar, Scanner val) {
        int trackDuplicate = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            ar[i] = val.nextInt();
        }

        System.out.println("The duplicate elements are: ");

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.print(ar[j] + " ");
                    trackDuplicate++;
                }
            }

        }
        if(trackDuplicate == 0){
            System.out.println("There are no duplicate elements.");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        FindDuplicate ob = new FindDuplicate();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        ob.sortDuplicate(arr, input);
    }
}
