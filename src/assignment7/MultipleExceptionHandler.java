package assignment7;

import java.util.Scanner;

public class MultipleExceptionHandler {

    public static void main(String[] args) {
        int[] value = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the five values: ");
        for (int i = 0; i < value.length; i++) {
            value[i] = input.nextInt();
        }
        try {
            value[4] = value[5] / 0;
        } catch (ArithmeticException e) {
            System.out.println("Zero cannot divide any number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of size of the array");
        }
    }
}
