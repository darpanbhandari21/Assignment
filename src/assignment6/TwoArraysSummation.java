package assignment6;

import java.util.Scanner;

public class TwoArraysSummation {

    public void sumTwoArrays(int[][] ar1, int[][] ar2, int[][] sumArray, int rSize, int cSize, Scanner val) {
        //First Array Elements
        System.out.println("***Elements of First Array***");
        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                System.out.print("Enter element " + i + j + ": ");
                ar1[i][j] = val.nextInt();
            }
        }

        //Second Array Elements
        System.out.println("\n***Elements of Second Array***");
        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                System.out.print("Enter element " + i + j + ": ");
                ar2[i][j] = val.nextInt();
            }
        }

        //Elements of Sum of two arrays
        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                sumArray[i][j] = ar1[i][j] + ar2[i][j];
            }
        }

        //Output of sum of two arrays
        System.out.println("\nThe Sum of two Arrays is: ");
        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        TwoArraysSummation ob = new TwoArraysSummation();
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row_size = value.nextInt();
        System.out.println("Enter the column size: ");
        int col_size = value.nextInt();
        int[][] arr1 = new int[row_size][col_size];
        int[][] arr2 = new int[row_size][col_size];
        int[][] sumArr = new int[row_size][col_size];
        ob.sumTwoArrays(arr1, arr2, sumArr, row_size, col_size, value);


    }
}
